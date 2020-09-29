package java8project;

import java.util.Scanner;

public class PrimeNoTest {

	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, n1,i;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number to check");
		num = obj.nextInt();
		if (num==0 || num==1)
		{
			System.out.println("0 and 1 cant be prime numbers");
		}
		else {
		for(i=2;i< num;i++) {
			
		if(num%i==0)
		{
		System.out.println("input number is" +num +"its not prime");
		break;
		}
		if (num%i != 0) {
			System.out.println("Given number is prime");
			break;
		}

	}

}
		
		}*/
	
	static void PrimeFunction(int n)
	
	{	int i;
		
		
		
		for(i=2;i< n;i++) {
			
		if(n%i==0)
		{
		System.out.println("input number is" +n +"its not prime");
		break;
		}
		if (n%i != 0) {
			System.out.println("Given number is prime");
			break;
		}

	}

	}
public static void main (String[] args)
{
int num;
	Scanner obj = new Scanner(System.in);
	System.out.println("enter the number to check");
	num = obj.nextInt();
	if (num==0 || num==1)
	{
		System.out.println("0 and 1 cant be prime numbers");
		
}
	else
	{
		PrimeFunction(num);
	}

}
}
		


