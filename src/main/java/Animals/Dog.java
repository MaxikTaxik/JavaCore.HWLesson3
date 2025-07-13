package Animals;

import java.time.LocalDate;
import java.util.Random;

public class Dog extends Animal {
	static private int id;

	public Dog(String name, String color, LocalDate dateOfBirth){
		this.name = name;
		this.color = color;
		this.dataOfBirth = dateOfBirth;
		Dog.id++;

		Random random = new Random();

		this.metersJumping = 2;
		this.metersRunning = 2000;
		this.metersSwimming = 10;
		this.metersJumping = randomFn(2);
		this.metersRunning = randomFn(2000);
		this.metersSwimming = randomFn(10);  // Алогоритм разброса значений в 25%: min + (max - min) * random.
	}

	public static int getId() {
		return id;
	}

	public boolean run(int obstanceSize){
	if (obstanceSize > metersRunning) {
		System.out.println("The dog can't run.");
		return false;
		}
		System.out.println("The dog is running.");
		return true;
	}
	public boolean swim(int obstanceSize){
		if (obstanceSize > metersSwimming) {
			System.out.println("The dog can't swim.");
			return false;
		}
		System.out.println("The dog is swimming.");

		return true;
	}
	public boolean jump(int obstanceSize){
		if (obstanceSize > metersJumping) {
			System.out.println("The dog can't jump.");
			return false;
		}
		System.out.println("The dog is jumping.");
		return true;
	}

	double randomFn(double metersObstance){
		Random random = new Random();
		metersObstance = metersObstance - (metersObstance * 0.25) +
			(metersObstance * 1.25 - (metersObstance - (metersObstance * 0.25))) * random.nextDouble();
		return metersObstance;
	}
}
