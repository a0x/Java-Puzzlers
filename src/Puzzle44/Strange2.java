package Puzzle44;

public class Strange2 {
	public static void main(String[] args) {
		Missing missing;
		try{
			missing = new Missing();
		} catch(java.lang.NoClassDefFoundError ex){
			System.out.println("Got it!");
		}
	}
}
