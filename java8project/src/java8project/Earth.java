package java8project;

public class Earth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Human tom;
		tom= new Human();
		tom.age= 12;
		tom.heightininches= 134;
		tom.eyecolor= "black";
		tom.name= "sameer";
		tom.Speak();
		
		Human joe= new Human();
		
		joe.age= 13;
		joe.heightininches=123;
		joe.eyecolor= "green";
		joe.name="vijay";
		joe.Speak();
*/
		
		Human human1= new Human("sam", 12, 34, "blue");
		Human human2= new Human("ash", 56, 230, "black");
		Human human3= new Human("nitin", 67, 670, "brown");
		human1.Speak();
		human2.Speak();
		human3.Speak();
		
	}

}