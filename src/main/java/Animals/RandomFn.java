package Animals;

import java.util.Random;

public interface RandomFn {
	default double randomFn(double metersObstance){
		Random random = new Random();
		metersObstance = metersObstance - (metersObstance * 0.25) +
			(metersObstance * 1.25 - (metersObstance - (metersObstance * 0.25))) * random.nextDouble();
		return metersObstance;
	}
}
