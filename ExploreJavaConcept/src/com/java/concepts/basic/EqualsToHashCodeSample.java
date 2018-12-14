package com.java.concepts.basic;

import java.util.HashMap;
import java.util.Map;

class Student {
	int id;
	String name;

	public Student(int i, String name) {
		this.id = i;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student(" + this.hashCode() + ") [id=" + id + " Name=" + name
				+ "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

}

class ReportCard {
	int marks;

	public ReportCard(int i) {
		this.marks = i;
	}

	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}

	/**
	 * @param marks
	 *            the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ReportCard(" + this.hashCode() + ") [marks=" + marks + "]";
	}

}

public class EqualsToHashCodeSample {

	public EqualsToHashCodeSample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Priyanka");
		Student s2 = new Student(1, "Saaru");

		System.out.println(s1.equals(s2)); // Returns false. If equals method
											// not overrided.

		Map<Student, ReportCard> record = new HashMap<Student, ReportCard>();

		System.out.println(s1.toString() + " " + s2.toString());

		ReportCard r1 = new ReportCard(100);
		ReportCard r2 = new ReportCard(100);

		System.out.println(r1.toString() + " " + r2.toString());

		record.put(s1, r1);
		record.put(s2, r2);

		System.out.println(record.toString());
		
		/**
		 * OUTPUT -
		 */
		// true
		// Student(32) [id=1 Name=Priyanka] Student(32) [id=1 Name=Saaru]
		// ReportCard(366712642) [marks=100] ReportCard(1829164700) [marks=100]
		// {Student(32) [id=1 Name=Priyanka]=ReportCard(1829164700) [marks=100]}

	}

}
