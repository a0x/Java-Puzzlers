package Puzzle29;

public class ForeverLoop {
	public static void main(String[] args) {
		double i = 0.0 / 0.0;
		System.out.println(i - 1 == 0);
		i = Double.NaN;
//		NaN stands for "Not a Number"
		System.out.print(i - 1 == 0);
	}
}
