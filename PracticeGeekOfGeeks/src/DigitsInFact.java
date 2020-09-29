import java.util.Scanner;

public class DigitsInFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		System.out.println("enter the no:");
		int number;
		number= input.nextInt();
		Factorial(number);
		

	}

	 static void Factorial(int number) {
		
		
		    {
		        double sum=0.0; //to store the sum of log n +log (n-1)+...
		        for(int j=1;j<=number;j++)
		        {
		            sum+=Math.log10(j);
		    
		        }
		        System.out.println( (int)(1+Math.floor(sum)));
		    }

		}
}
