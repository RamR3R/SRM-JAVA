package day6;


abstract class Animal{	
	abstract void sound();
	void eat() {
		System.out.println("Animal Eating");
	}
}

class Dog extends Animal
{
	void run() {
		System.out.println("Dog is running");
	}
	void sound() {
		System.out.println("Bow bow bow");
	}
}

class Cat extends Animal
{
	void sound() {
		System.out.println("Meow Meow");
	}
}


public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
		dog1.sound();
		cat1.sound();
		dog1.eat();
		
	}

}
