
import java.util.Scanner;

public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int low =0;
        int high=nums.length-1;
        
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[mid+1])
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
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
            
            int index=new FindPeakElement().findPeakElement(arr);
            System.out.println(index);
        }
    }
    
}
