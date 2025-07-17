package Animals;

import java.time.LocalDate;
import java.util.Random;

public class Dog extends Animal implements RandomFn {
	static private int id;

	public Dog(String name, String color, LocalDate dateOfBirth){
		this.name = name;
		this.color = color;
		this.dataOfBirth = dateOfBirth;
		Dog.id++;

		Random random = new Random();

		this.metersJumping = Obstance.METERS_JUMPING.getValues()[1];
		this.metersRunning = Obstance.METERS_RUNNING.getValues()[1];
		this.metersSwimming = Obstance.METERS_SWIMMING.getValues()[1];
		this.metersJumping = randomFn(metersJumping);
		this.metersRunning = randomFn(metersRunning);
		this.metersSwimming = randomFn(metersSwimming);  // Алогоритм разброса значений в 25%: min + (max - min) * random.
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
}
