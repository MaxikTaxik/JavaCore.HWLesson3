package Animals;
/**
 * Значения в перечислении по индексу: 0 - Cat, 1 - Dog, 2 - Bird
 */
public enum Obstance {
	METERS_JUMPING(new double[]{1.5, 2.0, 0.2}),
	METERS_RUNNING(new double[]{500, 2000, 0}),
	METERS_SWIMMING(new double[]{3, 10, 1000}),
	METERS_FLYING(new double[]{0, 0, 1_000_000});
	private double [] values;

	Obstance(double[] values) {
		this.values = values;
	}

	public double[] getValues() {
		return values;
	}
}
