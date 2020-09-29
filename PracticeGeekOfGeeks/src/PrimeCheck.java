import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int N= input.nextInt();
		System.out.println("You entered " + N);
		PrimeCheck check=new PrimeCheck();
		System.out.println("Result " + check.Prime(N));
	}
public boolean Prime(int n) {
	//int i;
	   // x=(int)(Math.sqrt(N)+1);
	   //x=N/2;
	if (n == 1 || n == 0) 
        return false; 
   
    // Check from 2 to n-1 
    for (int i = 2; i < n; i++) 
        if (n % i == 0) 
            return false; 
   
    return true; 
}

}
