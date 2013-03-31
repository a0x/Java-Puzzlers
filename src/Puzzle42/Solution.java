package Puzzle42;

public class Solution {
	public static void main(String[] args) {
		int [] [] tests = {{6, 5, 4, 3, 2, 1}, {1, 2}, {1, 2, 3}, {1}};
		int successCount = 0;
		
//		for(int i = 0; i < tests.length; i++)
//			if(thirdElementIsThree(tests[i]))
//				successCount++;
		
		for(int[] test: tests)
			if(thirdElementIsThree(test))
				successCount++;
		System.out.println(successCount);
	}
	
	private static boolean thirdElementIsThree(int [] a) {
		return a.length >= 3 && a[2] == 3;
//		Ҫ��ʶ���߼�����߼���Ĵ��ڣ����Ҳ�Ҫ������ʶ�����ö��ܺ���
	}
}
