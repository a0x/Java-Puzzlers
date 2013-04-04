package Puzzle47;

public class Solution {
	public static void main(String[] args) {
		Dog0 dogs[] = {new Dog0(), new Dog0()};
		for(int i = 0; i < dogs.length; i++)
			dogs[i].woof();
		Cat0 cats[] = {new Cat0(), new Cat0(), new Cat0()};
		for(int i = 0; i < cats.length; i++)
			cats[i].meow();
		System.out.print(Dog0.woofCount() + " woofs and ");
		System.out.println(Cat0.meowCount() + " meows");
	}
}

class Dog0 extends Counter{
	private static int woofCounter;
	public Dog0() {}
	public static int woofCount() {return woofCounter;}
	public void woof() {woofCounter++;}
}

class Cat0 extends Counter {
	private static int meowCounter;
	public Cat0() {}
	public static int meowCount() {return meowCounter;}
	public void meow() {meowCounter++;}
}