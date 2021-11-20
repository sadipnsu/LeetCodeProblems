
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {
     public int missingNumber(int[] nums) {
         
        Arrays.sort(nums);
        int result=0;
        
        for(int i=0;i<nums.length;i++)
        {
            //System.out.println("res= "+result);
            if(result!=nums[i])
            {
                return result;
            }
            result++;
        }
        
         return result;
    }
     
    public int missingNumber2(int[] nums) 
    {
        int len=nums.length;
        
        int calSum = len*(len+1)/2;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            sum=sum+nums[i];
        }
    
        int result= calSum-sum;
        return result;
    }        

     
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            //int result=new MissingNumber().missingNumber(arr);
            int result2=new MissingNumber().missingNumber2(arr);
            //System.out.println(result);
            System.out.println(result2);
        }
    }
}
