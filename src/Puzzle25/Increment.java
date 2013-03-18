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
//不要在单个表达式中对相同的变量赋值超过一次