Not Solved
package lab;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	public String name;
	
	
	public Dog(String name) {
		this.name=name;
	}

	public void sound(int volume) {
		System.out.println("Dog barks with volume: " + volume);
	}
}

class Cat extends Animal {

	private void sound() {
		System.out.println("Cat meows");
	}
}




public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Buddy");
		dog.sound(5); 

		Cat cat = new Cat("Whiskers");
		cat.sound();
	}

}
