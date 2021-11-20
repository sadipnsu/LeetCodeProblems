
package findthedifference;

import java.util.Arrays;


public class FindTheDifference {

    
    public char findTheDifference(String s, String t) {
        
        char[] X = s.toCharArray();
        char[] Y = t.toCharArray();
        
        Arrays.sort(X);
        Arrays.sort(Y);
        
        for(int i=0;i<s.length();i++)
        {
            if(X[i] != Y[i])
            {
                return Y[i];
            }
        }
        
        return Y[t.length()-1];
        
    }
    
    
    
    public static void main(String[] args) {
        
        char p = new  FindTheDifference().findTheDifference("", "y");
        System.out.println(p);
    }
    
}
