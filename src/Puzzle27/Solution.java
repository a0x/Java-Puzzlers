package Puzzle27;

public class Solution {
	public static void main(String[] args) {
		int distance = 0;
		for(int val = -1; val != 0; val <<= 1)
			distance++;
		System.out.print(distance);
	}
}
