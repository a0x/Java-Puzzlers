package Puzzle02;

import java.math.BigDecimal;

public class Change {
	public static void main(String[] args) {
		System.out.print((float)2.00 - (float)1.10);
		//System.out.printf("%.2f%n",2.00 - 1.10); Poor solution-still uses binary floating-point
		System.out.print(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}
}
