package Puzzle26;

public class Solution {
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	public static void Solution1() {
		int count = 0;
//		for(int i = START; i <= END; i++)
//		Change int i to long i
		for(long i = START;i <= END; i++)
			count++;
		System.out.print(count);
		
	}
	
	public static void Solution2() {
		int i = START;
		int count = 0;
		do{
			count++;
		}while(i++ != END);
		System.out.print(count);
	}
	
	public static void Solution3() {
		int i = Integer.MIN_VALUE;
		do{
//			f(i);
//			Apple the function f to all four billion int values
		}while(i++ != Integer.MAX_VALUE);
	}
	
	public static void main(String[] args) {
		Solution1();
		Solution2();
	}
}
