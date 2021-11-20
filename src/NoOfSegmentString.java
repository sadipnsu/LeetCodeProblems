
package noofsegmentstring;


public class NoOfSegmentString {

   public int countSegments(String s) {
        
       if(s.length()== 0)
       {
           return 0;
       }
     
      int count=0;
      
      String[] res = new String[s.length()];
      
      res = s.split(" ");
      
      for(String s1 : res)
      {
          if(!s1.isEmpty())
          {
              count++;
          }
      }
      return count;
    }
    public static void main(String[] args) {
        
        int segment = new NoOfSegmentString().countSegments("Hello");
        System.out.println(segment);
    }
    
    
    
}
