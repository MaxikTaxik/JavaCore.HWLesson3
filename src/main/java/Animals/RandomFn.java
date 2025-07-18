package Animals;

import java.util.Random;

public interface RandomFn {
	default double randomFn(double metersObstance){
		Random random = new Random();
		double min = metersObstance - metersObstance * 0.25;
		double max = metersObstance * 1.25;
		metersObstance = min + (max - min) * random.nextDouble();
		return Math.round(metersObstance * 100.0) / 100.0;
	}
}
