package com.java.concepts.basic;

/**
 * Final class cannot be extended.
 * @author Priyanka
 *
 */
final class FinalClass {

}

class FinalMethodSample {

	// FINALIZE METHOD - Used for cleanup processing before object is garbage
	// collected.
	@Override
	protected void finalize() throws Throwable {

		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("Finalize Called!!!");
	}

	final public void finalMethod() {

	}

	// FINAL METHOD - cannot be overloaded.
	public void finalMethod(int a) {

	}
}

class subClass extends FinalMethodSample {
	// FINAL METHOD - cannot be override.
	/*
	 * public void finalMethod() {
	 * 
	 * }
	 */
}

public class FinalFinallyFinalizeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10; // Single value Container

		// Boxing
		Integer iRef = new Integer(i); // Wrapper i Or Boxed i in an object.
										// Constructing the object.

		// UnBoxing
		int j = iRef.intValue(); // Extracting the value from the object.

		// AutoBoxing
		Integer iAutoRef = i; // Auto boxing (i.e. Integer iAutoRef = new
								// Integer(i))

		// AutoUnBoxing
		int jAuto = iRef; // Auto Unboxing (i.e int jAuto = iRef.intValue()

		final int i1 = 1000;
		// i1 = 2000; FINAL VARIABLE Cannot change the value. Compile time
		// error. Constant.

		try {
			int a = 0 / 10;
		} finally {
			System.out.println("Finally!!!");
		}
		
		//FINALIZE - finalize sample.
		FinalMethodSample fs = new FinalMethodSample();
		FinalMethodSample fs1 = new FinalMethodSample();
		fs1 = null;
		fs = null;
		System.gc();

	}

	// FINAL METHOD - Cannot infherit final method.
	/*
	 * class SubClass extends FinalClass {
	 * 
	 * }
	 */

}
