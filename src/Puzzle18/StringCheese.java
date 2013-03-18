package Puzzle18;

import java.io.UnsupportedEncodingException;

public class StringCheese {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte bytes[] = new byte[256];
		for(int i = 0; i < 256; i++)
			bytes[i] = (byte)i;
		String str = new String(bytes,"ISO-8859-1");
		for(int i = 0, n = str.length(); i < n; i++)
			System.out.println((int)str.charAt(i) + "");
		System.out.println(java.nio.charset.Charset.defaultCharset());
	}
}