package amaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class PhoneScreen {


	public static void main(String[] args) {
		//	createHistogram(new String[]{"go", "foo", "good", "a"});
		//	returnWordOddNumber();
		//	returnNumberOfTimesKeyWordReturned("apple");

		//	continuousSumOfNumbers();
		//	continuousSumOfNumbersWithoutString();
		//	locationOfKeyWord("car");

		logsAndError();	
		posOfSecondLargest();
	}

	//A function to return the position of the second largest element from an array 
	//e.g. Integer Array - {4, 5, 8, 2, 10, 9, 19}. What if there are two largest numbers?
	private static void posOfSecondLargest() {
		//sl -->10, pos -->4


		int a[] = {4, 5, 8, 2, 10, 9, 19};


		int l = a[0];
		int sl = a[0];
		int lPos = 0;
		int slPos = 0;

		for (int i = 1; i < a.length; i++) {
			if(a[i]>l) {
				slPos = lPos;
				lPos = i;
				l = a[i];
			}else if(a[i]>sl) {
				slPos = i;
				sl = a[i];
			}
		}
		System.out.println(slPos);



	}
	//Given logs of a format = {<datetime> <errID> <user>}, write a function to return a 
	//list of users who had the same error more than once a day.
	private static void logsAndError() {
		//		{<datetime> <errID> <user>, <datetime> <errID> <user>, <datetime> <errID> <user>}

		//datetime -- errId
		//datetime -- user
		HashMap<String, Integer> hm =  
				new HashMap<String, Integer>(); 
		Iterator hmIterator = hm.entrySet().iterator();

		//	 while(hmIterator.)




	}
	private static void locationOfKeyWord(String key) {
		String s = "I went to a car dealership yesterday ca looking for a car for myself. I ended buying a used car. The car's make is Toyota. I now have two cars in my garage.";

		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if(key.charAt(0)==s.charAt(i)) {
				int j = 1;
				i = i+1;
				while (j<key.length() && s.charAt(i)==key.charAt(j)) {
					i++;
					j++;					
				}
				if(j==key.length()) {
					set.add(i-key.length());
				}
			}
		}
		System.out.println(set);


	}
	private static void continuousSumOfNumbersWithoutString() {
		//991 = 9+9+1 = 19 = 447 = 4+4+7 = 15 = 6
		int n = 38;
		int op = 0;
		while(n>=10) {
			op = 0;
			while(n>0) {
				op  = op + n%10;
				n = n/10;
			}
			n = op;
		}
		System.out.println(op);

	}
	//Given a non-negative integer num, repeatedly add all its digits until the result has only one digit. answer
	private static void continuousSumOfNumbers() {
		// 9+9+9 = 2+7 = 9
		int n = 991;
		String s = String.valueOf(n);

		int sum = 0;	
		while((s.length()>1)) {
			sum = 0;
			for (int i = 0; i < s.length(); i++) {
				sum = sum + s.charAt(i) - 48;	
			}
			s = String.valueOf(sum);
			System.out.println(s);
		}
		System.out.println("Terminated");
		System.out.println(s);
	}

	//Write a function that takes a list of words and a keyword and returns the number of times that the keyword appears in the list.
	private static void returnNumberOfTimesKeyWordReturned(String string) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("orange");

		System.out.println(list);
		int num =0;
		for(String s:list) {
			if(s.contains(string)) {
				num++;
			}
		}
		System.out.println(num);
	}

	//Given a string containing words write me a function that returns the words that appear an odd number of times.
	private static void returnWordOddNumber() {

		String[] a = new String[]{"go", "doo", "doo", "good"};

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for(String s:a) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}

		for(Map.Entry<String, Integer> entry:map.entrySet()) {

			if(entry.getValue()%2==1) {
				System.out.println(entry.getKey());
			}

		}

	}


	/*	
	Coding: Write a function which takes in an array/list of strings and prints out a histogram (vertical) representation of the list on screen - on stdout.
	Example: Input : [“go”, “foo”, “good” “a”]
	Output:
	 *
	 * *
	 * * * 
	 * * * *
	 */
	private static void createHistogram(String[] a) {


		Arrays.sort(a, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}

		});

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length(); j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
