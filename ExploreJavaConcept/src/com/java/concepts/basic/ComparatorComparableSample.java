package com.java.concepts.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.concepts.basic.objects.Laptop;

public class ComparatorComparableSample {

	public static void main(String args[]) {
		List<Laptop> laps = new ArrayList<Laptop>();
		laps.add(new Laptop("Apple", 16, 1000));
		laps.add(new Laptop("Lenova", 8, 1800));
		laps.add(new Laptop("Acer", 32, 1600));

		// Using Comparable
		System.out.println("\nResult using comparable - sort over ram size : ");
		Collections.sort(laps);
		for (Laptop l : laps) {
			System.out.println(l.toString());
		}

		Comparator<? super Laptop> c = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.price > o2.price)
					return 1;
				else if (o2.price > o1.price)
					return -1;
				else
					return 0;
			}

		};
		// Using Comparator
		System.out.println("\nResult using comparator - sort over price : ");
		//laps.sort(c);
		Collection col;
		Collections.sort(laps, c);
		for (Laptop l : laps) {
			System.out.println(l.toString());
		}

		/**
		 * OUTPUT -
		 */
		// Result using comparable - sort over ram size :
		// Laptop [brand=Lenova, ram=8, price=1800]
		// Laptop [brand=Apple, ram=16, price=1000]
		// Laptop [brand=Acer, ram=32, price=1600]
		//
		// Result using comparator - sort over price :
		// Laptop [brand=Apple, ram=16, price=1000]
		// Laptop [brand=Acer, ram=32, price=1600]
		// Laptop [brand=Lenova, ram=8, price=1800]

	}

}
