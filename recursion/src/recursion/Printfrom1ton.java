package recursion;

public class Printfrom1ton {

	static void recur(int n)
	{
		if(n==0) {
			return;
		}
		
		recur(n-1);
		System.out.println("n is : "+n);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recur(5);
		

	}

}
