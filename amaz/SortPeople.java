package amaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortPeople {

	public static void main(String[] args) {
		
		
		People one = new People(12, 50, 60);
		//input - age height weight
		// positive flow - all the values (in the range)
		// all the person's value are same -- p1, p2 same -- results no sorting
		// some entry missing (age is missing)
		// decimal values
		// spaces along with the number
		// invalid entry like a string, special character
		//string containing the value like age : 20
		// negative -ve, all the persons
		//performance --
		//huge numbers age/ 23134234, entries more int value 2 power 32
		// 1-100, 100 - 10000
		// get a random number from 100 to 10000
		//	run a for loop that many times instantiating object
		// large numbers of people, entries more int value 2 power 32
		// how much to calculate, stability based on the number users (CPu memory)
		// different platforms (different OS, different browser)
		// localization : weight in pound:20, KG, cm, feet and inches
		//
		
		
		int numOfTimes = 10000;
		ArrayList<People> peoples = new ArrayList<People>();
		People people;
		for (int i = 0; i < numOfTimes; i++) {
			//fetching from excel
			//0 to 100 create random data age with the 0 to 100
			//
			people = new People(10, 10, 10);
			peoples.add(people);
			
		}
		
	//	Collection.sort()
		
		
		
		
		People two = new People(15, 55, 55);
		People three = new People(18, 45, 75);
		
//		ArrayList<People> peoples = new ArrayList<>();
		peoples.add(one);
		peoples.add(two);
		peoples.add(three);
		

		System.out.println("Sorting with hight");
		Collections.sort(peoples); //intger, String --alphabetically
		System.out.println(peoples);
		

		System.out.println("Sorting with weight");
		Collections.sort(peoples, new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {
				return o2.weight - o1.weight;
			}
		});
		System.out.println(peoples);
		
		System.out.println("Sorting with age");
		Collections.sort(peoples, new Comparator<People>() {

			@Override
			public int compare(People o1, People o2) {
				return o1.age - o2.age;
			}
		});
		System.out.println(peoples);
	}
}
