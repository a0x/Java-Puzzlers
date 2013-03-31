package Puzzle44;

public class Strange1 {
	public static void main(String[] args) {
		try{
			Missing missing = new Missing();
		} catch(java.lang.NoClassDefFoundError ex){
			System.out.println("Got it!");
		}
	}
}
