package Animals;

import java.time.LocalDate;

public abstract class Animal {
	protected String name;
	protected String color;
	protected LocalDate dataOfBirth;

	protected double metersJumping;
	protected double metersRunning;
	protected double metersSwimming;
	protected double metersFlying;

	abstract public boolean run(int obstanceSize);
	abstract public boolean swim(int obstanceSize);
	abstract public boolean jump(int obstanceSize);

}
