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
		this.metersJumping = metersJumping - (metersJumping * 0.25) +
			(metersJumping * 1.25 - (metersJumping - (metersJumping * 0.25)));
		this.metersRunning = metersRunning - (metersRunning * 0.25) +
			(metersRunning * 1.25 - (metersRunning - (metersRunning * 0.25)));
		if (waterfowl) {
			this.metersSwimming = metersSwimming - (metersSwimming * 0.25) +
				(metersSwimming * 1.25 - (metersSwimming - (metersSwimming * 0.25)));
		}
		  // Алогоритм разброса значений в 25%: min + (max - min) * random.
	}

	public static int getId() {
		return id;
	}

	public boolean run(int obstanceSize){
		if (obstanceSize > metersRunning) {
			System.out.println("The bird is running.");
			return false;
		}
		System.out.println("The bird can't run.");
		return true;
	}


	public boolean swim(int obstanceSize){
		if (waterflow) {
			if (obstanceSize > metersSwimming) {
				System.out.println("The bird is swimming.");
				return false;
			}
		}
		System.out.println("The bird can't swim.");
		return true;
	}

	public boolean jump(int obstanceSize){
		if (obstanceSize > metersJumping) {
			System.out.println("The bird is jumping.");
			return false;
		}
		System.out.println("The bird can't jump.");
		return true;
	}
}
