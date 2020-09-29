package java8project;

import java.util.ArrayList;

public class Application {
	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("sheep");
		
		for(int i=0; i< animals.size();i++) {
			System.out.println(animals.get(i));
		}
		
		for(String value: animals) {
			System.out.println(value);
		}
		
	}

}
