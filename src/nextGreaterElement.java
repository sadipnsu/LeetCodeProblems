
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


public class nextGreaterElement {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) 
    {
       HashMap<Integer,Integer> map = new HashMap<>();
       Stack<Integer> stack = new Stack<>();
       
       int j = nums2.length-1;
       
       while(j >= 0)
       {
           while(!stack.isEmpty() && nums2[j]>= stack.peek())
           {
               stack.pop();
           }
           
           if(stack.isEmpty())
           {
               map.put(nums2[j], -1);
           }
           else
           {
               map.put(nums2[j], stack.peek());
           }
           
           stack.push(nums2[j]);
           j--;
       }
       
       int arr[]=new int[nums1.length];
       int i=0;
       for(int item:nums1)
       {
           arr[i++]=map.get(item);
       }
       
       return arr;
    }

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[] = new int[x];
        int arr2[] = new int [y];
        
        for(int i=0;i<x;i++)
        {
            arr[i] = sc.nextInt();
        }
       
        for(int i=0;i<y;i++)
        {
            arr2[i] = sc.nextInt();
        }
        
        int answer[] = new nextGreaterElement().nextGreaterElement(arr, arr2);
        
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+",");
        }
     }
}
