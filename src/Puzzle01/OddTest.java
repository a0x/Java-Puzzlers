package Puzzle01;

public class OddTest {
	public static boolean isOdd(int i){
		//return i % 2 == 1; WRONG!!!
		return i % 2 != 0;
	}
	
	public static void main(String[] args){
		System.out.println(isOdd(-1));
	}
}
