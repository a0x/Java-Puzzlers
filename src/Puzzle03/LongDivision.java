package Puzzle03;

public class LongDivision {
	public static void main(String[] args) {
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
		System.out.print(MICROS_PER_DAY / MILLIS_PER_DAY);
	}
}
