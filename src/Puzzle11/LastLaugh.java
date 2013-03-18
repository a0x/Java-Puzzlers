package Puzzle11;

public class LastLaugh {
	public static void main(String[] args){
		System.out.print("H" + "a");
		//System.out.print('H' + 'a');
		
		StringBuffer sb = new StringBuffer();
		sb.append('H');
		sb.append('a');
		System.out.print(sb);
		
		//System.out.println("2+2=" + 2 + 2);
		System.out.printf("%c%c", 'H','a');
	}
	/*
	 * 当且仅当+操作符的操作数中至少有一个是String类型时，才会执行字符串连接操作；否则，执行加法。
	 * 如果要链接的数值中没有一个是字符串类型的，那么可以：
	 * 预置一个空字符串
	 * 将第一个数值用String.valueOf显式地转换成一个字符串
	 * 使用StringBuffer
	 * 使用System.out.printf*/
}