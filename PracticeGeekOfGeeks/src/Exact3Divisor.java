import java.util.Arrays;

public class Exact3Divisor {
	static void numbersWith3Divisors(int n) 
    { 
        boolean[] prime = new boolean[n+1]; 
        Arrays.fill(prime, true); 
        prime[0] = prime[1] = false; 
   
        for (int p=2; p*p<=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if (prime[p] == true) 
            { 
                // Update all multiples of p 
                for (int i=p*2; i<=n; i += p) 
                    prime[i] = false; 
            } 
        } 
   
        // print squares of primes upto n 
        System.out.println("Numbers with 3 divisors : "); 
        int count=0;
		for (int i=0;  i*i <= n ; i++) 
            {if (prime[i])
            	 count++;
           
              }
		System.out.print(count + " ");
            }
		
    
      
    // driver program 
    public static void main (String[] args)  
    { 
        int n = 30; 
        numbersWith3Divisors(n);  
    } 
} 
  

	


