package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
	public void printCompletelyDivided(int dividend, int divider) {

		if (dividend <= 0 || divider <= 0) {
			System.out.println("division by zero");
		} else {
			double result = dividend / divider;
			double resulTwo = result * divider;

			if (resulTwo == dividend && resulTwo != 0 && dividend != 0) {
				System.out.println("can be divided completely");
			} else {
				System.out.println("cannot be divided completely");
			}
		}
	}

	public static void main(String[] args) {
		IntegerDivider divider = new IntegerDivider();
		divider.printCompletelyDivided(25, 0);
	}
}
