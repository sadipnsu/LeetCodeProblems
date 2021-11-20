
import java.util.Scanner;


public class FindFirstAndLastPositionOfElementInSortedArray {
    
    public int[] searchRange(int[] nums, int target) {
        int first_index;
        int last_index;
        
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }
        
        first_index = lowerBound(nums,target);
        last_index = upperBound(nums,target);
        
        return new int[]{first_index,last_index};
    }
    
    public int lowerBound(int nums[],int target)
    {
        int low=0;
        int high =nums.length-1;
        
        while(low<high)
        {
            int mid = low+(high-low)/2;
            
            if(nums[mid]>=target)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        
        if(nums[low] !=target)
        {
            return -1;
        }
        return low;
    }
    
    public int upperBound(int[] nums,int target)
    {
        int low=0;
        int high =nums.length-1;
        
        while(low<high)
        {
            int mid = low+(high-low+1)/2;
            
            if(nums[mid]<=target)
            {
                low=mid;
            }
            else
            {
                high=mid-1;
            }
        }
        if(nums[low] != target)
        {
            return -1;
        }
        return low;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            
            int [] indexes = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(arr, target);
            for(int i:indexes)
            {
                System.out.print(i+" ");
            }
        }
    }
}
