
package hashmapsubstring;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapSubString {

    public HashMap<Character, Integer> getFre(String s){
        HashMap<Character, Integer> freS = new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            Character ch = s.charAt(i);
            if(freS.containsKey(ch)){
                freS.put(ch, freS.get(ch)+1);                
            }
            else {
                freS.put(ch, 1);
            }
        }
        
        return freS;
    }
    public boolean subSequenceHashMap(String s, String t)
    {
//        HashMap<Character, Integer> freS = new HashMap<>();
//        HashMap<Character, Integer> freT = new HashMap<>();
//        
//        for(int i=0;i<s.length();i++)
//        {
//            Character ch = s.charAt(i);
//            if(freS.containsKey(ch)){
//                freS.put(ch, freS.get(ch)+1);                
//            }
//            else {
//                freS.put(ch, 1);
//            }
//        }
//        
//        for(int i=0;i<t.length();i++)
//        {
//            Character ch = t.charAt(i);
//            if(freT.containsKey(ch)){
//                freT.put(ch, freT.get(ch)+1);                
//            }
//            else {
//                freT.put(ch, 1);
//            }
//        }
        
        HashMap<Character, Integer> freS = getFre(s);
        HashMap<Character, Integer> freT = getFre(t);
        
        
        for(HashMap.Entry<Character,Integer> entry: freS.entrySet())
        {
//            System.out.println(entry.getKey()+"= "+entry.getValue());
              char ch = entry.getKey();
              int f1 = entry.getValue();
              int f2 = 0;
              
              if(freT.containsKey(ch)){
                  f2 = freT.get(ch);
              }              
              System.out.println(ch + " -> "+f1 +"  "+ f2);
              if(f1 > f2){
                  return false;
              }            
        }
   
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()==true)
        {
            String x = sc.next();
            String y = sc.next();
           boolean result= new HashMapSubString().subSequenceHashMap(x, y);
           System.out.println("Is Possible: "+result);        
        }
    }
    
}
