import java.util.Scanner;

public class CelciusToFarenheight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.print("Enter the temp in celcius: ");
float number= input.nextFloat();
System.out.println("You entered " + number);
Farenheight(number);
	}

	static double Farenheight(float number) {
		double f;
		f= (number*9)/5+32;
		System.out.println("the value in farenheight" + f);
		return f;
		// TODO Auto-generated method stub
		
	}

}
