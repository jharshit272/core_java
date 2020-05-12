package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TestCode {

	
	public static void main(String[] args) {
	//	printingDuplicates();
	//	sortingVersion();	
	//	sortingVersionWithComparator();	
		sortingHashMap();
	}

	private static void sortingHashMap() {

		HashMap<String, String> map = new HashMap<String, String>();
	
		map.put("31", "Ramesh");
		map.put("2", "Rahul");
		map.put("1", "Ramesh");
		
		System.out.println(map);
		
	}

	private static void sortingVersionWithComparator() {

		String[] s = {"2.13.0", "1.23.14", "2.13.1", "1.18.4"};		

		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.split("\\.")[1].compareTo(o2.split("\\.")[1]);
			}
		});
		System.out.println(Arrays.toString(s));

	}

	private static void sortingVersion() {

		String[] s = {"2.13.0", "1.23.14", "2.13.1", "1.18.4"};
		System.out.println(Arrays.toString(s));

		Arrays.sort(s);
		System.out.println(Arrays.toString(s));

		s = new String[]{"Sharat", "Harshit", "Sharat", "2.13.1", "1.18.4"};
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));

	}

	private static void printingDuplicates() {
		String input = "dabccd";
		System.out.println(input.indexOf('c'));		
		StringBuilder sb = new StringBuilder();
		
		//output -- true if it has any duplicate
		//how many duplicate char
		//what are they i.e c		
		HashMap<Character, Integer> occurenceOf = new HashMap<Character, Integer>();		
		
		for(int i=0; i<input.length(); i++){
			if(!occurenceOf.containsKey(input.charAt(i))){
				occurenceOf.put(input.charAt(i), 1);
			}else{
				occurenceOf.put(input.charAt(i), occurenceOf.get(input.charAt(i))+1);
			}
		}
		
		boolean duplicateFlag = false;
		HashSet<Character> duplicateValues = new HashSet<Character>();
		for(Map.Entry<Character, Integer> entry : occurenceOf.entrySet()){
			if(entry.getValue()>1){
				duplicateFlag = true;	
				duplicateValues.add(entry.getKey());
			}
		}
		System.out.println(duplicateFlag);
		if(duplicateValues.size()>0){
			System.out.println(duplicateValues.size());
			System.out.println(duplicateValues);
		}
		
	}
}
