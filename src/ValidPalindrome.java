
package validpalindrome;


public class ValidPalindrome {
    
    
    public boolean isPalindrome2(String s)
    {
        String rev = "";
        String temp = "";
        
        char ch;
        int l = s.length();
        s = s.toLowerCase();
        
        for(int i=0;i<l;i++)
        {
            ch = s.charAt(i);
            
            if(ch>='a' && ch<='z' || ch>='0' && ch<='9')
            {
                rev = ch + rev;
                temp = temp + ch;
            }
        }
        
        return (rev.equals(temp));
        
        
    }
    

   public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        
       // int l= s.length();
        //System.out.println(l);
        while(i <= j){
            if(!(Character.isLetterOrDigit(s.charAt(i)))){
                i++;
                System.out.print(" i=> "+i);              // A man, a plan, a canal: Panama
            }
            else if(!(Character.isLetterOrDigit(s.charAt(j)))){
                j--;
                System.out.print(" J=> "+j);
            }
            else if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        
        boolean P = new ValidPalindrome().isPalindrome("race a car");
        boolean Q = new ValidPalindrome().isPalindrome2("A man, a plan, a canal: Panama");
        System.out.println(P);
        System.out.println(Q);
    }
    
}
