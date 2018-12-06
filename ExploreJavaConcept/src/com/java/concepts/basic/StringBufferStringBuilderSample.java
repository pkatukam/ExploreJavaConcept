package com.java.concepts.basic;

/*
 IMPORTANT OUTPUT

 PERFORMANCE TEST 
 ====================
 Execution time taken by StringBuffer - start time : 1543883528031 end time : 1543883528041 execution time : 10
 Execution time taken by StringBuilder - start time : 1543883528041 end time : 1543883528047 execution time : 6
 Execution time taken by String - start time : 1543883528048 end time : 1543883529926 execution time : 1878

 MUTABLE TEST 
 ====================
 String Hello
 StringBuffer Hello...Hi
 StringBuilder Hello...Hi

 */

public class StringBufferStringBuilderSample {

	public void isMutlableUnMutableTest() {
		String str = "Hello";
		StringBuffer sbuffer = new StringBuffer("Hello");
		StringBuilder sbuilder = new StringBuilder("Hello");

		str.concat("...Hi"); // InMutable - creates new String everytime the
								// value is changed. Value cannot be changed.
		sbuffer.append("...Hi");
		sbuilder.append("...Hi");

		System.out.println("String " + str);
		System.out.println("StringBuffer " + sbuffer);
		System.out.println("StringBuilder " + sbuilder);
	}

	public void performanceTest() {
		StringBuilder sbuilder = new StringBuilder();
		StringBuffer sbuffer = new StringBuffer();
		String str = "";

		long l = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sbuffer.append("A");
		}
		long k = System.currentTimeMillis();
		System.out
				.println("Execution time taken by StringBuffer - start time : "
						+ l + " end time : " + k + " execution time : "
						+ (k - l));

		l = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sbuilder.append("A");
		}
		k = System.currentTimeMillis();
		System.out
				.println("Execution time taken by StringBuilder - start time : "
						+ l
						+ " end time : "
						+ k
						+ " execution time : "
						+ (k - l));

		l = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			str = str.concat("A");
		}
		k = System.currentTimeMillis();
		System.out.println("Execution time taken by String - start time : " + l
				+ " end time : " + k + " execution time : " + (k - l));

	}

	public static void main(String args[]) {
		StringBufferStringBuilderSample sample = new StringBufferStringBuilderSample();
		System.out.println("\n PERFORMANCE TEST \n ====================");
		sample.performanceTest();
		System.out.println("\n MUTABLE TEST \n ====================");
		sample.isMutlableUnMutableTest();
	}

}
