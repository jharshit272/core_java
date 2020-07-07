package prac;

import java.util.HashSet;
import java.util.TreeSet;

public class CollectionCheck {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Hi");
		set.add("Hero");
		System.out.println(set);
		
		TreeSet<String> sortedSet = new TreeSet<String>(set);
		System.out.println(sortedSet);
	}
}
