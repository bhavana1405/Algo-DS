
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,reverse=0;
		int n= 121;
		int x=n;
		while(n>0) {
rem=n%10;
reverse= (reverse*10+rem);
n=n/10;
	}
if(reverse==n)
	System.out.println("Pallindrome");
else
	System.out.println("not pallindrome");
	
}
}