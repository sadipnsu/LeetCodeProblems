


public class PlusOne {

    public int[] plusOne(int[] digits) {
        
       for(int i=digits.length-1;i>=0;i--)
       {
           if(digits[i] != 9)
           {
               digits[i]++;
               break;
           }
           else
           {
               digits[i]=0;
           }
       } 
           
           if(digits[0] == 0)
           {
               int[] res = new int[1];
               res[0]=1;
               return res;
           }
       
       return digits;
    }
  
    public static void main(String[] args) {
        
        int []value = new PlusOne().plusOne(new int[]{1,2,9});
        
        for(int i=0;i<value.length;i++)
        {
            System.out.print(value[i]);
        }
                    System.out.println();

    }
    
}
