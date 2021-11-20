
package uniquecharacter;

import java.util.HashMap;


public class UniqueCharacter {

    
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c) + 1 );
            }
            
            else
            {
                map.put(c,1);
            }
        }
        
        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            if(map.get(ch)==1)
            {
                return i;
            }
        }
        return -1;
       
    }

    
    public static void main(String[] args) {
        
        int index = new UniqueCharacter().firstUniqChar("aabbc");
        System.out.println(index);
    }
    
}
