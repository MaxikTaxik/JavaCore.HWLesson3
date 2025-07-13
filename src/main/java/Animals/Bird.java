package Animals;

import java.time.LocalDate;
import java.util.Random;

public class Bird extends Animal {
	static private int id;
	private boolean waterflow;

	public Bird(String name, String color, LocalDate dateOfBirth, boolean waterfowl){
		this.name = name;
		this.color = color;
		this.dataOfBirth = dateOfBirth;
		this.waterflow = waterfowl;
		Bird.id++;

		Random random = new Random();

		this.metersJumping = 0.2;
		this.metersFlying = 1_000_000;
		if (waterfowl) {
			this.metersSwimming = 1000;
		}
		this.metersJumping = randomFn(0.2);
		this.metersRunning = randomFn(1_000_000);
		if (waterfowl) {
			this.metersSwimming = randomFn(1000);
		}
		  // Алогоритм разброса значений в 25%: min + (max - min) * random.
	}

	public static int getId() {
		return id;
	}

	public boolean run(int obstanceSize){
		if (obstanceSize > metersRunning) {
			System.out.println("The bird can't run.");
			return false;
		}
		System.out.println("The bird is running.");
		return true;
	}


	public boolean swim(int obstanceSize){
		if (waterflow) {
			if (obstanceSize > metersSwimming) {
				System.out.println("The bird can't swim.");
				return false;
			}
		}
		System.out.println("The bird is swimming.");
		return true;
	}

	public boolean jump(int obstanceSize){
		if (obstanceSize > metersJumping) {
			System.out.println("The bird can't jump.");
			return false;
		}
		System.out.println("The bird is jumping.");
		return true;
	}

	double randomFn(double metersObstance){
		Random random = new Random();
		metersObstance = metersObstance - (metersObstance * 0.25) +
			(metersObstance * 1.25 - (metersObstance - (metersObstance * 0.25))) * random.nextDouble();
		return metersObstance;
	}
}
