package java8project;
import java.util.Scanner;


public class Factorial {

	
	static int Factorial(int n)
	{
		if (n==0)
				return 1;
		else 
			
			return (n*Factorial(n-1));
		
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num,fact;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number for finding factorial");
		num = obj.nextInt();
		fact= Factorial(num);
		System.out.println("Factorial of the given number" +num +" is " + fact);
		

	}

}
