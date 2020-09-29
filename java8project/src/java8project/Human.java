package java8project;

public class Human {
	String name;
	int age;
	int heightininches;
	String eyecolor;
	
	/*public Human() {
		age= 12;
		heightininches= 134;
		eyecolor= "black";
		name= "sameer";
		Speak();
		}
		*/
	
	public Human(String name, int age, int heightininches, String eyecolor) {
		super();
		this.name = name;
		this.age = age;
		this.heightininches = heightininches;
		this.eyecolor = eyecolor;
	}

	
	public void Speak() {
		System.out.println("my name is"+name);
		System.out.println("my age is"+age);
		System.out.println("my height is"+heightininches);
		System.out.println("my eyecolor is"+eyecolor);
		
	}
	
	public void Eat() {
		System.out.println("eating...");
	}
	
	public void Sleep() {
		System.out.println("sleeping...");
	}
	
	public void Walk() {
		System.out.println("walking...");
	}
}
