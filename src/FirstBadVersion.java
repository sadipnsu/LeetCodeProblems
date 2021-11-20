
import java.util.Scanner;


public class FirstBadVersion {
    
    public int firstBadVersion(int n) {
        int low=1;
        int high=n;
        
        while(low<high)
        {
            int mid = low+(high-low)/2;
            //if(isBadVersion(mid))
            {
                high=mid;
            }
          //  else
            {
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int result=new FirstBadVersion().firstBadVersion(n);
            System.out.println(result);
        }
        
    }
}
