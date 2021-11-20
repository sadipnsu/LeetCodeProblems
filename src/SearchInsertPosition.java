
import java.util.Scanner;


public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }
            
           else if(nums[mid]>target)
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return left;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
       {
           int n = sc.nextInt();
           int []arr = new int[n];
           
           for(int i=0;i<n;i++)
           {
               arr[i]=sc.nextInt();
           }
           int t= sc.nextInt();
           int result=new SearchInsertPosition().searchInsert(arr, t);
           System.out.println(result);
       }
    }
    
}
