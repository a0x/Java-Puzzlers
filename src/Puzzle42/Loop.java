package Puzzle42;

public class Loop {
	public static void main(String[] args) {
		int [] [] tests = {{6, 5, 4, 3, 2, 1}, {1, 2}, {1, 2, 3}, {1}};
		int successCount = 0;
		try {
			int i = 0;
			while(true){
				if(thirdElementIsThree(tests[i++]))
					successCount++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}
//		不要使用异常控制循环，应该只为异常条件而使用异常
		System.out.println(successCount);
	}
	
	private static boolean thirdElementIsThree(int [] a) {
		return a.length >= 3 & a[2] == 3;
	}
}
