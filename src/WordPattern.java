
package wordpattern;

import java.util.HashMap;


public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length)
        {
            return false;
        }
        
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0; i<pattern.length();i++)
        {
          Character ch = pattern.charAt(i);
          
          if(map.containsKey(ch))
          {
              if( !map.get(ch).equals(arr[i] ))
                  return false;
          }
          
           else if (map.containsValue(arr[i]))
                    return false;
           
            map.put(ch, arr[i]);
          
        }
        
        return true;
    }

    
    public static void main(String[] args) {
        
       boolean p = new WordPattern().wordPattern("aaaa","dog dog dog dog");
        System.out.println(p);
    }
    
}
