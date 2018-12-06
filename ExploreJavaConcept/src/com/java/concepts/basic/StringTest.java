package com.java.concepts.basic;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";

		System.out
				.println("==================================================\n"
						+ "String str1 = new String(\"Hello\");\n"
						+ "String str2 = new String(\"Hello\");\n"
						+ "String str3 = \"Hello\";\n"
						+ "String str4 = \"Hello\");\n"
						+ "==================================================\n");

		System.out.println("Comparing String : str1.equals(str2) : "
				+ str1.equals(str2)); // true
		System.out.println("Comparing String : str1 == str2 : "
				+ (str1 == str2)); // false
		System.out.println("Comparing String : str1.equals(str3) : "
				+ str1.equals(str3)); // true
		System.out.println("Comparing String : str1 == str3 : "
				+ (str1 == str3)); // false
		System.out.println("Comparing String : str3 == str4 : "
				+ (str3 == str4)); // true

	}
}
