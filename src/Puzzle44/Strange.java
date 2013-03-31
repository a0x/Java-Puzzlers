package Puzzle44;
//	想要编写一个能够探测类丢失的程序，请使用反射
//	不要对捕获NoClassDefFoundError形成依赖
public class Strange {
	public static void main(String[] args) throws Exception {
		try {
			Object m = Class.forName("Missing").newInstance();
		} catch (ClassNotFoundException e) {
			 System.err.println("Got it!");
		}
	}
}
