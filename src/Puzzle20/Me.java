package Puzzle20;
import java.util.regex.Pattern;
import java.io.File;
public class Me {
	public static void main(String[] args) {
		System.out.println(
				Me.class.getName().replaceAll(".", "/") + ".class");
		
		System.out.println(
				Me.class.getName().replaceAll("\\.", "/") + ".class");
		
		System.out.println(
				Me.class.getName().replaceAll(Pattern.quote("."), "/") + ".class");
		
		System.out.println(
				Me.class.getName().replaceAll("\\.", File.separator) + ".class");
	}
}