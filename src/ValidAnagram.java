
import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {
    
    public boolean isAnagram(String s, String t) {
        
        char [] string1 = s.toLowerCase().toCharArray();
        char [] string2 = t.toLowerCase().toCharArray();
        
        Arrays.sort(string1);
        Arrays.sort(string2);
        
        String str = String.valueOf(string1);
        String str2 = String.valueOf(string2);
        
        return str.equals(str2);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String s = sc.next();
            String t = sc.next();
            
           boolean result= new ValidAnagram().isAnagram(s, t);
           System.out.println(result);
        }
    }
}
