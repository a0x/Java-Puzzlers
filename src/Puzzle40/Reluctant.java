package Puzzle40;

public class Reluctant {
	private Reluctant internalInstance = new Reluctant();
//	This statement above will call the constructor recursively and cause seriously stack overflow.
	public Reluctant() throws Exception {
		throw new Exception("I'm not coming out.");
	}
	
	public static void main(String[] args) {
		try{
			Reluctant b = new Reluctant();
			System.out.println("Surprise!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("I told you so.");
		}
	}
}
