
public class pallindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="989";
		String reverse="";
		for(int i=input.length()-1;i>=0; i--) {
			reverse+= input.charAt(i);
		}
			if (reverse.equals(input)) {
				System.out.println("pallindrome");
			}
			else {
				System.out.println("not pallindrome");
			}
		

	}

}
