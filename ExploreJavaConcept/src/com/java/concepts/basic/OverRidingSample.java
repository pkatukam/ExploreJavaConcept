package com.java.concepts.basic;

class Parent {
	private void privateMethod() {
		System.out.println("This is the private method in the parent class.");
	}

	static public void staticMethod() {
		System.out.println("This is the static method in the parent class.");
	}
}

class Child extends Parent {

	/**
	 * Not Overriding. Its like two seperate methods. Since the private methods
	 * have no acess outside the class.
	 **/
	private void privateMethod() {
		System.out.println("This is the private method in the child class.");
	}

	/**
	 * Not Overriding Hiding the parent method. Since static methods belong to
	 * class its called hiding and not overriding.
	 **/
	static public void staticMethod() {
		System.out.println("This is the static method in the child class.");
	}

	public void test() {
		System.out.println("test");
	}
}

public class OverRidingSample {

	public OverRidingSample() {
		this(0);
		System.out.println("Hi");
	}

	public OverRidingSample(int x) {
		this(0, 0);
		System.out.println("Hello");
	}

	public OverRidingSample(int x, int y) {
		System.out.println("How are you?");
	}

	public static void main(String args[]) {
		Parent p = new Child();
		Child c = new Child();
		p.staticMethod(); // parent static method is called.
		c.staticMethod(); // child static method is called.
		// p.privateMethod(); //-private so cannot access outside the class

		/** Output */
		// This is the static method in the parent class.
		// This is the static method in the child class.

		OverRidingSample os = new OverRidingSample();

		/** Output **/
		// How are you?
		// Hello
		// Hi

	}

}
