package Puzzle23;

import java.util.Random;

public class Rhymes4 {
	public static void main(String[] args) {
		String a[] = {"Pain","Main","Gain"};
		System.out.print(randomElement(a));
	}
	private static Random rnd = new Random();
	private static String randomElement(String[] a){
		return a[rnd.nextInt(a.length)];
	}
}
