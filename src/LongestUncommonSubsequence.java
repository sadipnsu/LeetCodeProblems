
package longestuncommonsubsequence;


public class LongestUncommonSubsequence {

  public int findLUSlength(String a, String b) {
     
      if(a.equals(b))
      {
          return -1;
      }
      return Math.max(a.length(),b.length());
    }
    
    

    public static void main(String[] args) {
        
        int length = new LongestUncommonSubsequence().findLUSlength("aaa","bbbaabbb");
        System.out.println(length);
    }
    
    
    
    
}
