package Puzzle25;

public class Increment {
	public static void main(String[] args) {
		int j = 0;
		for(int i = 0; i < 100; i++)
			//j = j++;   j=0
			j = ++j;
		System.out.print(j);
	}
}
//��Ҫ�ڵ������ʽ�ж���ͬ�ı�����ֵ����һ��