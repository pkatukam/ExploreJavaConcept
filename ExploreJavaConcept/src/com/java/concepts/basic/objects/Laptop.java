package com.java.concepts.basic.objects;

public class Laptop implements Comparable {

	public String brand;
	public int ram;
	public int price;

	public Laptop(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * @param ram
	 *            the ram to set
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price
				+ "]";
	}

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object l) {
		// TODO Auto-generated method stub

		if (this.ram > ((Laptop) l).ram)
			return 1;
		else if (this.ram < ((Laptop) l).ram)
			return -1;
		else
			return 0;

	}

}
