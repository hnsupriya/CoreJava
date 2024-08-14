package com.course1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ForLoopAndStreamAPI {

	public static void main(String[] args) {

		List<Integer> studentNos = new ArrayList<>();

		// CRUD ==Operations
		// for every CRUD change ,it requires reindexing , new memory allocation takes
		// place and re shuffles
		// this leads to the performance issue == reindex

		studentNos.add(10);// index =0
		studentNos.add(1000);// index =1
		studentNos.add(1000);
		studentNos.add(1222);
		studentNos.add(10222);
		studentNos.add(10);
		studentNos.add(1000);// index =6

		// get student whose number is 1000

		// Core loops while / do while / for loop / for loops 1.5

		int index = 1;

		while (studentNos.size() > index) {

			if (studentNos.get(index) == 1000) {
				System.out.println(studentNos.get(index));
			}

			index = index + 1;
			// index++ == index = index+1

		}

		int index2 = studentNos.size();

		do {

			if (studentNos.get(index2) == 1000) {
				System.out.println(studentNos.get(index2));
			}

			index2 = index2 - 1;

		} while (studentNos.size() > index2);

		// for--> index / counter
		List<Integer> studentNos1000 = new ArrayList<>();

		for (int index3 = 1; studentNos.size() > index3; index3++) {// iteration the data
			if (studentNos.get(index2) == 1000) {// applying the condition
				System.out.println(studentNos.get(index2));
				studentNos1000.add(studentNos.get(index2));// collecting the data
			}

		}

		System.out.println(studentNos1000);

		// Stream api stream()====for loop
		// filter() ===if
		// filter(temp -> temp==1000 )

		List<Integer> studentNos10002 = studentNos.stream().filter(temp -> temp == 1000).collect(Collectors.toList());

		System.out.println(studentNos10002);

		// Lamda expression --->

		// ()->stmt
		// (p1,p2) ->{p1..}

		// duplicate value
		Map<Integer, String> studentMap3 = new HashMap<>();

		studentMap3.put(10, "rama");// entry one
		studentMap3.put(11, "suresh");// entry two
		studentMap3.put(12, "rama");// entry three
		studentMap3.put(13, "sai");// entry four
		studentMap3.put(14, "suresh");// entry five

		// jdk1.5
		Map<Integer, String> studentMap10 = new HashMap<>();
		for (Integer key : studentMap3.keySet()) {// iteration the data
			if (key == 10) {// applying the condition
				System.out.println(studentMap3.get(key));
				studentMap10.put(key, studentMap3.get(key));// collecting the data
			}

		}

		// Map<Integer, String> studentFilteredMap =
		// method references ===Collectors.toMap(Map.Entry::getKey

		Map<Integer, String> studentMap102 = studentMap3.entrySet().stream()
				.filter((entry) -> entry.getKey() == Integer.valueOf(10))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(studentMap102);

		/// iterating the data , applying conditions / manupulation data (intermidiate
		/// operations )
		// collecting the data using collect == terminal operation == lazy invocation

	}

}
