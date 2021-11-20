
import java.util.Scanner;


public class StudentAttendanceRecordI {
    
    public boolean checkRecord(String s) {
        char[] arr = s.toCharArray();
        int count_absent=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='A')
            {
                count_absent++;
            }
            
        }
        if(count_absent>=2 || s.contains("LLL"))
        {
            return false;
        }
        
        return true;
       
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
      
    boolean result = new StudentAttendanceRecordI().checkRecord(s);
    System.out.println(result);
    }
}
