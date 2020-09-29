import java.util.Scanner;

public class Factorial {

	 static int fact = 1 ;
	static int i = 1 ;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i,fact=1;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number= input.nextInt();
		System.out.println("You entered " + number);
		long result = Fact(number);
		
		System.out.println("Facorial of the no is : " + result);

	}

	 static long Fact(int number) {
	 for(i=1;i<=number;i++) {
			 fact=fact*i; 
		 }
		 
		return fact;
	}
	
// fact = 1*1 
// fact = 1*2
//fact = 2*3 	 
	 
	 
	 
}
