package com.java.concepts.basic;

/**
 * IMPORTANT - A block is executed when an object of the class is
 * created/constructed while the static class is loaded when the class is loaded
 * in the JVM/Memory.
 **/
class A {
	static int i = 100;
	static {
		i = i-- - --i;
		System.out.println("First " + i);
	}
	{
		i = i++ + ++i;
		System.out.println("Second " + i);
	}
}

class B extends A {
	static {
		i = i-- - --i;
		System.out.println("Third " + i);
	}
	{
		i = i++ + ++i;
		System.out.println("Forth " + i);
	}
}

public class StaticBlockOutputSample {

	public StaticBlockOutputSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		B b = new B();
		// System.out.println(b.i);

	}

	/** OUTPUT - **/
	// First 2
	// Third 2
	// Second 6
	// Forth 14
	// 14

}
