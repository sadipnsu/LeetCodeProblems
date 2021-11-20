
import java.util.HashMap;
import java.util.Scanner;


public class majorityElement {
 
    public int majorityElement(int[] nums) {
    
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        int val = nums[i];
        if(map.containsKey(val))
        {
            map.put(val, map.get(val)+1);
        }
        else
        {
            map.put(val, 1);
        }
    }
    
   int max = 0,element=0;
   for(HashMap.Entry<Integer,Integer> entry: map.entrySet())
   {
       if(max<entry.getValue())
       {
           element=entry.getKey();
           max=entry.getValue();
       }
   }
    return element;
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
            
           int result = new majorityElement().majorityElement(arr);
            System.out.println(result);

        
        }       
    }
}
