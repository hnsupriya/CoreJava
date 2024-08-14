package com.course1;

//data structure  ==

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListSetQueue {

	public static void main(String[] args) {
		// List --> allows duplicates and follows the insertion order

		// Set --> no duplicates and no insertion order

		// Wrapper classes --> jdk 1.5
		// what are wrapper classes
		// --> stack memory --> this data will be available till the thread alive
		// Mark sweep algorithm --> dean process --> garbage collection --> heap memory

		// 100 oops =---> primitive data types === its objects
		/*
		 * 100 object oriented programming language --> Wrapper classes --> int stack
		 * === Integer heap char stack == Character heap long stack === Long heap
		 * boolean stack === Boolean heap byte stack === Byte heap float stack === Float
		 * heap double stack === Double le heap
		 */
		// collectionname<Datatype/wrapperclass> objectName = new collectionname<>()
		//// java.lang --> object class

		ArrayList<Integer> studnum = new ArrayList<Integer>();
		// CRUD ==Operations
		// for every CRUD change ,it requires reindexing , new memory allocation takes
		// place and re shuffles
		// this leads to the performance issue == reindex

		studnum.add(1);
		studnum.add(1);
		System.out.println(studnum);

		// bulk data == just read operation use ArrayList

		HashSet<Integer> studnum1 = new HashSet<Integer>();
		// CRUD ==Operations

		studnum1.add(1);
		studnum1.add(1);
		System.out.println(studnum1);
		// Home work :
		// create data using linked list and Treeset and print
		// read all the interview questions of the programs = last three days

		// as per the java standard the declaration of the Object on the implemnetation
		// classes

		// left side interface name<warpper classes / any other class> variablename =
		// new Implmentationclass<>()

		HashSet<String> studname = new HashSet<String>();
		studname.add("Hari");
		studname.add("hari");
		System.out.println(studname);

		String s1 = "Hari";
		String s2 = "Hari";

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		LinkedList<Integer> studno = new LinkedList<Integer>();
		// 1. if the data is keeping changing --> shopping cart --> items / adding and
		// removing
		// // all once u create the data -0-> it wont change much

		studno.add(1);
		studno.add(1);
		System.out.println(studno);

		List<String> studentNames = new LinkedList<>();

		// where data is going through insert / update/ delete Operations --> then use
		// linked
		// linked internally works on pointer concept
		// where is change happens in the neighbor node simply current node update the
		// pointer

		studentNames.add("ram");
		studentNames.add("test");
		studentNames.add("java");
		studentNames.add("kotlin");

		// Map --> 6 implementation class 1. HashTable - 2. HashMap 3. LinkedHashMap
		// 4.TreeMap(SorttedMap)

		Map<Integer, String> studentMap = new HashMap<>();

		studentMap.put(10, "Hari");
		studentMap.put(11, "Naga");
		studentMap.put(12, "Supriya");
		studentMap.put(13, "Sai");
		studentMap.put(14, "Harish");

		System.out.println(studentMap);

		// duplicate key --> if map has duplicate key ---> what will happen

		Map<Integer, String> studentMap2 = new HashMap<>();
		studentMap2.put(10, "Hari");
		studentMap2.put(10, "Naga");
		studentMap2.put(12, "Supriya");
		studentMap2.put(13, "Sai");
		studentMap2.put(10, "Harish");

		System.out.println(studentMap2);

		// duplicate value
		Map<Integer, String> studentMap3 = new HashMap<>();

		studentMap3.put(10, "Hari");
		studentMap3.put(11, "Hari");
		studentMap3.put(12, "Supriya");
		studentMap3.put(13, "Sai");
		studentMap3.put(14, "Supriya");

		System.out.println(studentMap3);

		Map<String, Integer> studentMap4 = new HashMap<>();

		studentMap4.put("maths", 100);
		studentMap4.put("science", 90);
		studentMap4.put("english", 84);
		studentMap4.put("hindi", 78);
		studentMap4.put("social", 89);
		studentMap4.put("telugu", 98);
		System.out.println(studentMap4);

		//

		Map<String, Integer> studentMap5 = new HashMap<>();
 
		studentMap5.put("maths", 100);
		studentMap5.put("science", 100);
		studentMap5.put("english", 84);
		studentMap5.put("hindi", 84);
		studentMap5.put("social", 99);
		studentMap5.put("telugu", 98);
		System.out.println(studentMap5);

		// No Duplicate

		TreeSet<Integer> Studnum4 = new TreeSet<>();
		Studnum4.add(12);
		Studnum4.add(23);
		Studnum4.add(34);
		Studnum4.add(45);
		Studnum4.add(56);
		System.out.println(Studnum4);

		// TreeSet with Duplicates
		// Default Acceding Order
		// Parent is Sorted set
		TreeSet<Integer> Studnum5 = new TreeSet<>();
		Studnum5.add(12);
		Studnum5.add(34);
		Studnum5.add(34);
		Studnum5.add(45);
		Studnum5.add(12);
		System.out.println(Studnum5);

		// TreeMap No Duplicates

		TreeMap<String, Integer> Studnum6 = new TreeMap<>();
		Studnum6.put("maths", 100);
		Studnum6.put("science", 90);
		Studnum6.put("english", 84);
		Studnum6.put("hindi", 78);
		Studnum6.put("social", 89);
		Studnum6.put("telugu", 98);
		System.out.println(Studnum6);

		TreeMap<String, Integer> Studnum7 = new TreeMap<>();

		Studnum7.put("maths", 100);
		Studnum7.put("science", 100);
		Studnum7.put("english", 84);
		Studnum7.put("hindi", 84);
		Studnum7.put("social", 99);
		Studnum7.put("telugu", 98);
		System.out.println(Studnum7);

	}
}
