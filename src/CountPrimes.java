
package countprimes;


public class CountPrimes {

    public int countPrimes(int n) {
        
        int count=0;
        boolean flag;
       
        
        for(int i=1;i<=n;i++)
        {
            flag=false;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=true;
                    break;   
                }
            }
            
            if(flag==false && i>=2)
            {
                count++;
            }
        }
        return count;
    }

    
    public static void main(String[] args) {
        int prime = new CountPrimes().countPrimes(2);
        System.out.println(prime);
    }
    
}
