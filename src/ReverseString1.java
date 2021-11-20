
package reversestring1;


public class ReverseString1 {

    public void reverseString(char[] s) {
        
        char temp;
        int j = s.length-1;
        
        for(int i=0;i<j;i++,j--)
        {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        
        ReverseString1 obj = new ReverseString1();
        obj.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
         
    }
    
}
