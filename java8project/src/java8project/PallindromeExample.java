package java8project;

import java.util.Scanner;

public class PallindromeExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num, rem,x,rev=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number to check");
		num = obj.nextInt();
		x=num;
		while(num!=0) {
			rem=num%10;
			rev=rem+rev*10;
			num= num/10;
			
		}
		
if (x==rev)
{
	System.out.println("given no is pallindrome");
}
else {
	System.out.println("Given no is not a pallindrome");
	
}


	}

}
