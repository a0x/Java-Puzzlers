package Puzzle51;

public class Solution {
	protected final int x, y;
	private String name;
	
	Solution(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	protected String makeName() {
		return "[" + x + ", " + y + "]";
	}
	
	public final synchronized String toString() {
		if(name == null)
			name = makeName();
		return name;
	}
}
