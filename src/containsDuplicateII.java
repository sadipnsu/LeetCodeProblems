
import java.util.HashMap;
import java.util.Scanner;


public class containsDuplicateII {
    public boolean containsDuplicate(int[] nums,int k) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int j = map.get(nums[i]);
                if(Math.abs(i-j) <= k)
                {
                    return true;
                }
            }
                map.put(nums[i], i);
            
        }
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[]= new int[n];
            
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            boolean result = new containsDuplicateII().containsDuplicate(arr,k);
            System.out.println(result);
            
        }
    }
    
}
