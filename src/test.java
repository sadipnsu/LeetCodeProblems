
import java.util.HashMap;
import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        
        HashSet<Integer> map = new HashSet<>();
        map.add(1);
        map.add(2);
        map.add(4);
        map.add(4);
        
        for(int num:map)
        {
            System.out.println(num);
        }
    }
    
}
