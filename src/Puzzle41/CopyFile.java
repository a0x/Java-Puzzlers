package Puzzle41;

import java.io.*;

public class CopyFile {
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
			if(in != null)
				in.close();
//			可能会抛出IOExceptoin,导致finally提前结束
//			对于人和在finally语句块中可能抛出的受检查异常都要进行处理，而不是任其传播
			if(out != null)
				out.close();
		}
	}
}
