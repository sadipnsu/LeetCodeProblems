
package repeatedsubstring;


public class RepeatedSubstring {

    public boolean repeatedSubstringPattern(String s) {
        
        String a = s.concat(s);
        //System.out.println(a);
        
        a = a.substring(1,a.length()-1);
        if(a.contains(s))
        {
            return true;
        }
        return false;
    }
   
    public static void main(String[] args) {
        
        boolean p = new RepeatedSubstring().repeatedSubstringPattern("abcabcabcabc");
        System.out.println(p);
    }
    
    
}
