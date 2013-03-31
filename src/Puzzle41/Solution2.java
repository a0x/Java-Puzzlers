package Puzzle41;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Solution2 {
	static void copy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while((n = in.read(buf)) >= 0)
				out.write(buf, 0, n);
		} finally {
			closeIgnoringException(in);
			closeIgnoringException(out);
		}
	}
	
	private static void closeIgnoringException (Closeable c) {
		if (c != null){
			try{
				c.close();
			} catch(IOException e){
//				do something...
			}
		}
	}
}
