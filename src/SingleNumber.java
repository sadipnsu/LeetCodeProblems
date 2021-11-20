
package singlenumber;

import java.util.HashMap;


public class SingleNumber {

   public int singleNumber(int[] nums) {
     
       HashMap<Integer,Integer> map = new HashMap<>();
       
       for(int i=0;i<nums.length;i++)
       {
         if(map.containsKey(nums[i]))
         {
             map.put(nums[i],map.get(nums[i])+1);
         }
         
         else
         {
             map.put(nums[i],1);
         }
       }
       
       for(int i=0;i<nums.length;i++)
       {
           if(map.get(nums[i]) ==1 )
           {
               return nums[i];
           }
       }
       return -1;
}
    
    
    public static void main(String[] args) {
        
        int value = new SingleNumber().singleNumber(new int[]{2,2,1,1,5});
        System.out.println(value);
    }
    
}
