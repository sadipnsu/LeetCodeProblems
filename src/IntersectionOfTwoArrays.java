
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
       
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i:nums1)
        {
            if(!set.contains(i))
            {
                set.add(i);
            }
        }
        
        for(int j:nums2)
        {
            if(set.contains(j))
            {
                list.add(j);
                set.remove(j);
            }
        }
        
        int result[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
        return result;
    }
    
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int []arr = new int[x];
            int []arr2 = new int[y];
            for(int i=0;i<x;i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int j=0;j<y;j++)
            {
                arr2[j]=sc.nextInt();
            }
            
           int result[]= new IntersectionOfTwoArrays().intersection(arr, arr2);
            System.out.println("Result is: ");
           for(int i:result)
           {
               System.out.print(i+",");
           }
        }
        
    }
}
