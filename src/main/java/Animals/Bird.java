package Animals;

import java.time.LocalDate;
import java.util.Random;

public class Bird extends Animal implements RandomFn{
	static private int id;
	private boolean waterflow;

	public Bird(String name, String color, LocalDate dateOfBirth, boolean waterfowl){
		this.name = name;
		this.color = color;
		this.dataOfBirth = dateOfBirth;
		this.waterflow = waterfowl;
		Bird.id++;

		Random random = new Random();

		this.metersJumping = Obstance.METERS_JUMPING.getValues()[2];
		this.metersFlying = Obstance.METERS_FLYING.getValues()[2];
		if (waterfowl) {
			this.metersSwimming = Obstance.METERS_SWIMMING.getValues()[2];
		}
		this.metersJumping = randomFn(metersJumping);
		this.metersRunning = randomFn(metersRunning);
		if (waterfowl) {
			this.metersSwimming = randomFn(metersSwimming);
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
}
