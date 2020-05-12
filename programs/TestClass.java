package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class TestClass {

	public static void main(String[] args) {
		System.out.println("method");
		
		 String a = "I am happy and why not";
		   String b = "why are you not happy and you should be";
		   
		   HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		   
		   map1.put("happy", 1);
		   map1.put("why", 2);
		   
		   String[] geeks = {"Rahul", "Utkarsh", 
                   "Shubham", "Neelam"}; 

 // Conversion of array to ArrayList 
 // using Arrays.asList 
// ArrayList<String> al = Arrays.asList(a.split(" "));
	//	   ArrayList<String> al = new ArrayList<String>();
	//	   ArrayList<String> al1 = new ArrayList<String>();
 //System.out.println(al);
 List<String> al = Arrays.asList(a.split(" "));
 List<String> al1 = Arrays.asList(b.split(" ")); 
 System.out.println(al.contains("happy"));
 System.out.println(al);
 //Collections.addAll(al, a.split(" "));
 //Collections.addAll(al1, b.split(" "));
 al.retainAll(al1);
// 
 Set<String> result = al.stream()
		  .filter(al1::contains)
		  .collect(Collectors.toSet());
// 
// System.out.println(result);
 //Arrays.Utils.
	}
}
