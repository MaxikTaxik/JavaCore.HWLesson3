package Main;

import Animals.Animal;
import Animals.Bird;
import Animals.Cat;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		LocalDate dateOfBirthCat = LocalDate.of(2023, 03,05);
		LocalDate dateOfBirthDuck = LocalDate.of(2024, 07, 15);
		Cat cat = new Cat("Muzik", "Black", dateOfBirthCat);
		cat.swim(4);
		Bird duck = new Bird("Cracky", "Yellow", dateOfBirthDuck, true);
		cat.jump(4);
		duck.swim(4);
	}
}
