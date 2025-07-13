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
		this.metersJumping = metersJumping - (metersJumping * 0.25) +
			(metersJumping * 1.25 - (metersJumping - (metersJumping * 0.25)));
		this.metersRunning = metersRunning - (metersRunning * 0.25) +
			(metersRunning * 1.25 - (metersRunning - (metersRunning * 0.25)));;
		this.metersSwimming = metersSwimming - (metersSwimming * 0.25) +
			(metersSwimming * 1.25 - (metersSwimming - (metersSwimming * 0.25)));  // Алогоритм разброса значений в 25%: min + (max - min) * random.
	}

	public static int getId() {
		return id;
	}

	public boolean run(int obstanceSize){
		if (obstanceSize > metersRunning) {
			System.out.println("The dog is running.");
			return false;
		}
		System.out.println("The dog can't run.");
		return true;
	}
	public boolean swim(int obstanceSize){
		if (obstanceSize > metersSwimming) {
			System.out.println("The dog is swimming.");
			return false;
		}
		System.out.println("The dog can't swim.");
		return true;
	}
	public boolean jump(int obstanceSize){
		if (obstanceSize > metersJumping) {
			System.out.println("The dog is jumping.");
			return false;
		}
		System.out.println("The dog can't jump.");
		return true;
	}
}
