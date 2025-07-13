package Animals;

import java.time.LocalDate;
import java.util.Random;

public class Cat extends Animal{
	static private int id;

	public Cat(String name, String color, LocalDate dateOfBirth){
		this.name = name;
		this.color = color;
		this.dataOfBirth = dateOfBirth;
		Cat.id++;


		this.metersJumping = 1.5;
		this.metersRunning = 500;
		this.metersSwimming = 3;
		this.metersJumping = randomFn(1.5);
		this.metersRunning = randomFn(500);
		this.metersSwimming = randomFn(3);  // Алогоритм разброса значений в 25%: min + (max - min) * random.
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

	double randomFn(double metersObstance){
		Random random = new Random();
		metersObstance = metersObstance - (metersObstance * 0.25) +
			(metersObstance * 1.25 - (metersObstance - (metersObstance * 0.25))) * random.nextDouble();
		return metersObstance;
	}
}


