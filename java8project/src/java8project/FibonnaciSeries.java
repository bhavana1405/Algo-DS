package java8project;

public class FibonnaciSeries {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		{    
			 int n1= 0, n2= 1,i,n3, count= 10;
			 System.out.print(n1+ " "+n2);
			 for(i=0;i<=count;i++)
			 {
				// System.out.println(" start :  printing i = "+i);
				 n3=n1+n2;
			 System.out.print(" "+n3);
			 n1=n2;
			 n2=n3;
			// System.out.println(" end printing i = "+i);
			 }
			 
			  
			}
	}
}*/
	static int n1=0, n2=1, n3; 
			static void fib(int num)
	{
		while (num>0)
				{
			n3 = n1+n2 ;
			System.out.print(" " +n3);
			n1=n2;
			n2=n3;
			num = num-1;
			// fib(num);
			
			
			
			
			
				}
	}
	
	public static void main(String[] args)
	{
	int num=10;
		//fib(num);
		System.out.println(+n1 +" " +n2);
		fib(num-2);
	}
}
	