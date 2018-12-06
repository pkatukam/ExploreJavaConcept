package com.java.concepts.basic;

class Animal {

	Animal() {
		System.out.println("Constructor Animal");
	}
}

class Dog extends Animal {

	public Dog() {
		System.out.println("Constructor B " + this.hashCode() + " "
				+ super.hashCode() + " " + this.getClass() + " "
				+ super.getClass());
	}

}

public class ConstructorSamples {

	// Important - no Static allowed. Only public, private and protected
	// constructors allowed.

	public ConstructorSamples() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		Dog d = new Dog();
		System.out.println(d);

		/*
		 * Super class object is not created when subclass object is created.
		 * IMPORTANT Output 
		 * Constructor Animal 
		 * Constructor B 366712642 366712642
		 * class com.oops.classes.Dog class com.oops.classes.Dog
		 * com.oops.classes.Dog@15db9742
		 */
	}

}
