
public abstract class Animal {
	
	String gender;
	int weightInLBs;
	int age;
	public Animal(int weightInLBs,String gender, int age) {
		//super();
		this.gender = gender;
		this.weightInLBs = weightInLBs;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("sleeping");
	}
	
	public abstract void move();
}
