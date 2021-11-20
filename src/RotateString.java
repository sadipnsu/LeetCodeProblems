
import java.util.Scanner;


public class RotateString {
    
    public boolean rotateString(String s, String goal) {
        
        if(s.length()!=goal.length())
        {
            return false;
        }
        
        String str = s+s;
        
        if(str.contains(goal))
        {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String s = sc.next();
            String goal = sc.next();
            boolean result= new RotateString().rotateString(s, goal);
            System.out.println(result);
        }
    }
    
}
