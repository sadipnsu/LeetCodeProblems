
import java.util.HashMap;
import java.util.Scanner;


public class containsDuplicate {
    
    public boolean containsDuplicate(int[] nums) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int val = nums[i];
            if(map.containsKey(val))
            {
                return true;
                //map.put(val, map.get(val)+1);
            }
            else
            {
                map.put(val, 1);
            }
        }  
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int arr[]= new int[n];
            
            for(int i=0;i<n;i++)
            {
                arr[i]= sc.nextInt();
            }
            boolean result = new containsDuplicate().containsDuplicate(arr);
            System.out.println(result);
            
        }
    }
    
}
