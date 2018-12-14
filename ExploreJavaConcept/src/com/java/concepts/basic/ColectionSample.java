package com.java.concepts.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
 * Collection Hierarchy
 * 
 * 
 * 
 * @author Priyanka
 *
 */
/**
 Iterables(I) <-- Collection(I) 

 Collection(I)
 <-- List(I)
 <-- Queue(I)
 <-- Set(I)

 List(I)
 <-- ArrayList
 <-- LinkedList
 <-- Vector  <-- Stack

 Queue(I)
 <-- PriorityQueue
 <-- DQueue(I)  <-- ArrayDequeue

 Set(I)
 <-- HashSet
 <-- LinkedHashSet
 <-- SortedSet(I)  <-- TreeSet

 ------------------------------------
 Not Part of Collection Framework. Separate Map Hierarchy. Does not extend Collection Interface.

 Map(I) 
 <-- HashMap 	
 <-- HashTable
 <-- SortedMap(I)
 <-- TreeMap

 **/
/**
 * @author Priyanka
 *
 */
public class ColectionSample {

	public static void main(String[] args) {

		Collection collection;
		List list; // An ordered collection that allows duplicate elements.
					// Allows
					// multiple null elements too.

		Set set; // A collection that contains no duplicate elements. Takes one
					// null value(HashSet but TreeSet doesn't take null values)
		Queue queue; // LIFO. Cannot access/retrieve nth element. Does'nt take
						// null value. Accepts duplicates but no null values.
		Map map;

		Integer[] int_array = { 1, 1, 7, 9, 7, 5, 7, 6 };
		Integer[] int_null_array = { 1, 1, 7, null, 9, 7, null, 5, 7, 6 };

		Integer[] int_arraytest = new Integer[100000];

		for (int i = 0; i < 100000; i++) {
			int_arraytest[i] = i;
		}

		list = new ArrayList<Integer>();
		long before = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			list.add(int_arraytest[i]);
		// Collections.addAll(list, int_arraytest);
		long after = System.currentTimeMillis();
		// System.out.println("ArrayList - " + list);// ArrayList - [1, 1, 7,
		// null,
		// null, 9,
		// 7, 5, 7, 6]
		System.out.println("Time taken by arraylist to add elements - "
				+ (after - before));

		before = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			list.contains(i);
		// Collections.addAll(list, int_arraytest);
		after = System.currentTimeMillis();
		// System.out.println("ArrayList - " + list);// ArrayList - [1, 1, 7,
		// null,
		// null, 9,
		// 7, 5, 7, 6]
		System.out.println("Time taken by arraylist to find element - "
				+ (after - before));

		before = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			list.remove(0);
		// Collections.addAll(list, int_arraytest);
		after = System.currentTimeMillis();
		// System.out.println("ArrayList - " + list);// ArrayList - [1, 1, 7,
		// null,
		// null, 9,
		// 7, 5, 7, 6]
		System.out.println("Time taken by arraylist to remove element - "
				+ (after - before));

		queue = new LinkedList();// Priority queue sorts the data for us.
		// queue.add(null);//NullPointerException.
		before = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			queue.add(int_arraytest[i]);
		// Collections.addAll(queue, int_arraytest);
		after = System.currentTimeMillis();
		// System.out.println("PriorityQueue - " + queue);//
		// NullPointerException.
		System.out.println("Time taken by LinkedList to add elements - "
				+ (after - before));

		before = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			queue.contains(i);
		after = System.currentTimeMillis();
		// System.out.println("PriorityQueue - " + queue);//
		// NullPointerException.
		System.out.println("Time taken by LinkedList to find elements - "
				+ (after - before));

		before = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++)
			queue.poll();
		after = System.currentTimeMillis();
		// System.out.println("PriorityQueue - " + queue);//
		// NullPointerException.
		System.out.println("Time taken by LinkedList to remove elements - "
				+ (after - before));

		// System.out.println("PriorityQueue after poll - " + queue);
		// Does'nt Take null values.
		// (After removing null values) Queue - [1, 1, 5, 6, 7, 7, 7, 9]

		set = new HashSet<Integer>();
		Collections.addAll(set, int_null_array);
		System.out.println("HashSet - " + set);// Set - [null, 1, 5, 6, 7, 9]

		map = new HashMap<Integer, Integer>();
		for (Integer i : int_null_array) {
			map.put(i, i);
		}
		System.out.println("HashMap " + map); // HashMap {null=null, 1=1, 5=5,
												// 6=6, 7=7, 9=9}
		// TreeMap + Hashtable does'nt accept null values

		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(2);
		lista.add(1);

		System.out.println(lista);
		lista.set(4, 5);
		lista.set(3, 4);
		lista.set(2, 3);
		lista.set(1, 2);
		lista.set(0, 1);

		System.out.println(lista);
		// Arraylist does not guarantee FIFO. Queue guarantees FIFO.

		Set sampleSet = new TreeSet();
		// No duplicates. Accept Null values. Does not maintain order. Because
		// of hashing technigq used for storing the elements.

		// Set sampleSet = new LinkedHashSet();
		// No duplicates. Accept Null values. Maintain order.

		// Set sampleSet = new TreeSet();
		// No duplicates. Does not accept Null values, throws null pointer
		// exception. Does not maintain order but sorts
		// the elements by alphabetic order. Slow for using this technique while
		// adding the element.

		sampleSet.add("John");
		sampleSet.add("Joe");
		sampleSet.add("Albert");
		sampleSet.add("Jim");
		sampleSet.add("Joseph");
		sampleSet.add("Kevin");
		sampleSet.add("Jordan");
		sampleSet.add("Jack");
		sampleSet.add("Leonard");

		System.out.println("Hashset/LinkedHashSet/TreeSet output" + sampleSet);

	}

	/**
	 * Output -
	 * 
	 */
	// Time taken by arraylist to add elements - 10
	// Time taken by arraylist to find element - 7167
	// Time taken by arraylist to remove element - 1174
	// Time taken by LinkedList to add elements - 7
	// Time taken by LinkedList to find elements - 17074
	// Time taken by LinkedList to remove elements - 6
	// HashMap {null=null, 1=1, 5=5, 6=6, 7=7, 9=9}
	// Hashset output[null, Joe, Kevin, Joseph, John, Leonard, Albert, Jordan,
	// Jack, Jim]
	// LinkedHashSet output[null, John, Joe, Albert, Jim, Joseph, Kevin, Jordan,
	// Jack, Leonard]
	// TreeSet output[Albert, Jack, Jim, Joe, John, Jordan, Joseph, Kevin, Leonard]


}
