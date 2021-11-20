



public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
     
     int i=0;
     int j=0;
     
     
     if(s.length()> t.length())
     {
         return false;
     }
             
        while(i<s.length() && j<t.length())
        {
           if(s.charAt(i)== t.charAt(j))
           {
                i++;
                
           }
           j++;
            
        }
        return i==s.length();
        
    }
    
    public static void main(String[] args) {
        
        boolean p = new IsSubsequence().isSubsequence("aaab","aaaaaabc");
        System.out.println(p);
    }
    
}
