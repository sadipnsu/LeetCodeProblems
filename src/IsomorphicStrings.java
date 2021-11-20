
package isomorphicstrings;

import java.util.HashMap;
import java.util.Map;


public class IsomorphicStrings {
    
    
    public boolean isIsomorphic(String s, String t) {
        
        return check(s,t)&& check(t,s); 
        
    }
    
    
        public boolean check(String a,String b)
        {
            Map<Character,Character> map = new HashMap<>();
            int i=0;
            int l = a.length();
            
            while(i<l)
            {
                char ach = a.charAt(i);
                char bch = b.charAt(i);
                
                if(map.containsKey(ach))
                {
                    if(map.get(ach)!= bch) 
                        return false;
                }
                
                else 
                    map.put(ach, bch);
                    i++;
            }
            return true;
        }
        
        
        public boolean isIsomorphic2(String s, String t)
        {
            Map<Character,Character> map = new HashMap<>();
            
            for(int i=0;i<s.length();i++)
            {
                if(!map.containsKey(s.charAt(i)))
                {
                    if(map.containsValue(t.charAt(i)))
                        return false;
                    
                    map.put(s.charAt(i),t.charAt(i));
                }
                
                else if (map.get(s.charAt(i)) != t.charAt(i))
                        return false;
                    
            }
            return true;
        }

        
        
        
        public static void main(String[] args) {
            
            boolean p = new IsomorphicStrings().isIsomorphic("paper", "title");
            System.out.println(p);
    }
        
        
    
}
