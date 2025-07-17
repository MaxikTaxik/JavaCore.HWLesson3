package Animals;

import java.time.LocalDate;
import java.util.Random;

public class Cat extends Animal implements RandomFn{
	static private int id;

	public Cat(String name, String color, LocalDate dateOfBirth){
		this.name = name;
		this.color = color;
		this.dataOfBirth = dateOfBirth;
		Cat.id++;


		this.metersJumping = Obstance.METERS_JUMPING.getValues()[0];
		this.metersRunning = Obstance.METERS_RUNNING.getValues()[0];
		this.metersSwimming = Obstance.METERS_SWIMMING.getValues()[0];
		this.metersJumping = randomFn(metersJumping);
		this.metersRunning = randomFn(metersRunning);
		this.metersSwimming = randomFn(metersSwimming);  // Алогоритм разброса значений в 25%: min + (max - min) * random.
	}

	public static int getId() {
		return id;
	}

	public boolean run(int obstanceSize){
		if (obstanceSize > metersRunning) {
			System.out.println("The cat can't run.");
			return false;
		}
		System.out.println("The cat is running.");
		return true;
	}
	public boolean swim(int obstanceSize){
		if (obstanceSize > metersSwimming) {
			System.out.println("The cat can't swim.");
			return false;
		}
		System.out.println("The cat is swimming.");
		return true;
	}
	public boolean jump(int obstanceSize){
		if (obstanceSize > metersJumping) {
			System.out.println("The cat can't jump.");
			return false;
		}
		System.out.println("The cat is jumping.");
		return true;
	}
}


