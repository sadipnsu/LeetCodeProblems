
package detectcapital;


public class DetectCapital {

   
    public boolean detectCapitalUse(String word) {
       
        int size = word.length();
        
        int cap=0,low=0;
        
        for(int i=0;i<size;i++)
        {
            if(word.charAt(i) >= 'A' && word.charAt(i)<='Z')
            {
                cap++;
            }
            
            if(word.charAt(i) >= 'a' && word.charAt(i)<='z')
            {
                low++;
            }
        }
        
        if(cap==size) return true;
        if(low==size) return true;
        if(word.charAt(0)>='A' && word.charAt(0)<='Z')
        {
            if(low==size-1)
            {
                return true;
            }
        }
        return false;
       
    }
    
    
    public static void main(String[] args) {
    
        boolean check = new DetectCapital().detectCapitalUse("flaG");
        System.out.println(check);
    }
    
}
