package practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortPeople {

	public static void main(String[] args) {
		
		
		People one = new People(12, 50, 60);
		People two = new People(15, 55, 55);
		People three = new People(18, 45, 75);
		
		ArrayList<People> peoples = new ArrayList<>();
		peoples.add(one);
		peoples.add(two);
		peoples.add(three);
		
		Collections.sort(peoples);
		System.out.println(peoples);
	}
}
