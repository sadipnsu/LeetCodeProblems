
package reversevowelstring;

import java.util.HashSet;


public class ReverseVowelString {

    public String reverseVowels(String s) {
        
        int i = 0;
        int j = s.length()-1;
        char[] words = s.toCharArray();
        
        HashSet<Character> vowels = new HashSet<>();
        
        vowels.add('a'); vowels.add('A');
        vowels.add('e'); vowels.add('E');
        vowels.add('i'); vowels.add('I');
        vowels.add('o'); vowels.add('O');
        vowels.add('u'); vowels.add('U');
        
        while(i<j)
        {
            char ch1 = words[i];
            char ch2 = words[j];
            
            if(vowels.contains(ch1) && vowels.contains(ch2))
            {
                swap(words,i,j);
                i++;
                j--;
            }
            
            else if(vowels.contains(ch1))
            {
                j--;
            }
            
            else if(vowels.contains(ch2))
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }
        }
        
        String ans = new String(words);
        
        return ans;
    }
    
    public void swap(char[] arr,int x,int y)
    {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y]= temp;
    }
    
    
    public static void main(String[] args) {
        
        String p = new ReverseVowelString().reverseVowels("leetcode");
        System.out.println(p);
    }
    
}
