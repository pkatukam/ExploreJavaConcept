package com.java.concepts.basic;

class ParentClass {
	public static void foo() {
		System.out.println("Static foo method in the parent class.");
	}

	public void bar() {
		System.out.println("Non static method in the parent class.");
	}
}

class ChildClass extends ParentClass {
	public static void foo() {
		System.out.println("Static foo method in the child class.");
	}

	public void bar() {
		System.out.println("Non static method in the child class.");
	}
}

public class SttaticMethodOverridingOutput {

	public static void main(String[] args) {
		ParentClass par = new ChildClass();
		ChildClass chi = new ChildClass();

		par.foo();
		chi.foo();
		par.bar();
		chi.bar();

		/** Output - **/
		// Static foo method in the parent class.
		// Static foo method in the child class.
		// Non static method in the child class.
		// Non static method in the child class.

	}

}
