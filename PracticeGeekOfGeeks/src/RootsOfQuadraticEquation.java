import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	      System.out.print("Enter a: ");
	      int a = s.nextInt();
	      System.out.print("Enter b: ");
	      int b = s.nextInt();
	      System.out.print("Enter c: ");
	      int c = s.nextInt();
	      Roots(a,b,c);
	}

	 static void Roots(double a, double b, double c) {
		 double d=0;
		 d=((b*b)-(4*a*c));
		 if (d<0){
			 System.out.println("Imaginary Roots");
			 
		 }
		 else {
			 double[] ans = new double[2]; 
		        ans[0] = (-b+Math.sqrt(d))/(2*a); 
		       // int i = ans[0].intValue();
		        int value1 = (int) ans[0];
		        ans[1] = (-b-Math.sqrt(d))/(2*a); 
		        int value2 = (int) ans[1];
		        System.out.println(+value1 +"" +value2);
			 
		 }
		
		
	}

}
