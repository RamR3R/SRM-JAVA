package day6;

interface Vehicle{
	void run();
	void start();
}

interface Electric{
	void recharge();
}

class Car implements Vehicle, Electric
{
	public void start() {
		System.out.println("Car Started");
	}
	public void run() {
		System.out.println("Car running......");
	}
	public void recharge() {
		System.out.println("Car is recharging");
	}
}

class Bike implements Vehicle
{
	public void start() {
		System.out.println("Bike Started");
	}
	public void run() {
		System.out.println("Bike Running.....");
	}
}


public class InterFaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.start();
		car1.run();
	}

}
