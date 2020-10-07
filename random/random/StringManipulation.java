package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringManipulation {


	// convert the string to only numbers

	public static void main(String[] args) {
		//	random();	

		String string = "aabbbccccaaad";
	//	countOccurence(string);
	//	countOccurenceBetter(string);
		countOccurenceBetterSequential(string);

		String users = " User1,User2,User1,User3,User1,User2,User2,User1";
		//		findCount(users);



	}

	private static void countOccurenceBetterSequential(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			int count = 1;
			while((i+1 < s.length()) && s.charAt(i)==s.charAt(i+1)) {
				count ++;
				i++;
			}
			sb.append(count);
		}
		System.out.println(sb);

	}

	private static void countOccurenceBetter(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
//			Adding to strign buffer;
		}
		
	}

	private static void findCount(String users) {
		String[] user = users.split(",");
		HashMap<String, Integer> userLoginCount = new HashMap<String, Integer>();
		int n = user.length; 	

		for(int i = 0; i < n; i++){
			if(userLoginCount.containsKey(user[i])){
				int value = userLoginCount.get(user[i])+1;
				userLoginCount.replace(user[i], value);
			}else{
				userLoginCount.put(user[i], 1);
			}
		}
		System.out.println(userLoginCount);
	}

	private static void countOccurence(String string) {

		StringBuffer sb = new StringBuffer();
		int num = 1;
		for(int i=0; i<string.toCharArray().length-1; i++){
			if(string.charAt(i)==string.charAt(i+1)){
				num++;
			}else{

				sb.append(string.charAt(i));
				sb.append(num);
				num=1;
			}

			if(i+1==string.toCharArray().length-1){
				sb.append(string.charAt(i));
				sb.append(num);
				num=1;
			}
		}
		System.out.println(sb);

	}

	private static void random() {
		String sample = "amz 20+15, lyft 7.3, late fee 27, kitch 4, amz 13+19, lyft 7.6, lyft 6.3, amz 18.4+8";

		//	System.out.println(sample.replaceAll("\\D", " + "));
		//	System.out.println(sample.replaceAll("[\\D.-]", " + ").replaceAll("[++]", ""));
		ArrayList<String> newArray = new ArrayList<String> (Arrays.asList(sample.split("[^\\d.-]")));
		System.out.println(newArray.removeAll(Arrays.asList("")));
		System.out.println(newArray.toString().replaceAll(", ", "+" ));		

	}


	/*
	Given a list of strings, group strings which are anagrams of each other
	e.g.
	Input: [cat, tea, apple, ate, tac, act]
	Output: [[cat", "tac", act], [tea", ate], [apple]]
	 */

	//all unique string
	// all are anagrams
	// empty input
	//input is very big sized arrray
	// elements are substring of each other
	//numbers, specialString
	//elements are big sized string, null character/ single character
	// String = "abc/n%d"  == regular Expression  == for breaking the code

	

}
