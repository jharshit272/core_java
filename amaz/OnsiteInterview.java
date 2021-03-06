package amaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OnsiteInterview {

	public static void main(String[] args) {

		//	anagram();
	//	printFormatted("MI_is_one_of_the_best_place_to_work__It_is_nice__It_is_fun_");
		printFormattedMultipleUnderscore("MI_is_one_of_the_best_place_to_work____It_is_nice__It_is_fun__I_am_working_there_");
		//	summingIntegersInString("a12cfgh345a1a");
		//	findingPairThatSumToFive("a12cf56ggg1g14ha1sgs3a3cd12qw4gff5");

		//	findingPairThatSumToFiveDifferent("a12cf56g14gg1g14ha1sgs3cd12qw4gff5");
		//	findingPairThatSumToFiveInArray();
		
		
	}

	private static void findingPairThatSumToFiveInArray() {

		int a[] = {1,2,12,7,8,14,3,4,1,3};

		int gs=15;
		System.out.println("-------------O(n^2)----------------");

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(gs-a[j]==a[i]) {
					System.out.println(a[i]+" "+a[j]);
					break;
				}
			}
		}

		System.out.println("-----------------------------");

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(gs-a[i])) {
				if(map.get(gs-a[i])>0) {
					System.out.println(a[i]+" "+(gs-a[i]));	
					map.put(gs-a[i], map.getOrDefault(gs-a[i], 1)-1);
					map.put(gs-a[i], map.getOrDefault(gs-a[i], 1)-1);
				}
			}else  {
				map.put(a[i], map.getOrDefault(a[i], 0)+1);
			}
		}

	}



	private static void findingPairThatSumToFiveDifferent(String s) {
		//ip : "a12cf56ggg1g14ha1a3cd12qw4gff5"
		//output = 2,3;1,4
		//	ArrayList<Integer> map = new ArrayList<Integer>(); 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 

		StringBuffer n = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {

			if(i < s.length() && Character.isDigit(s.charAt(i))){				
				n.append(s.charAt(i));

			}
			else if(!n.toString().isEmpty()) {
				map.put(Integer.valueOf(n.toString()), 
						map.getOrDefault(Integer.valueOf(n.toString()), 0)+1);
				n = new StringBuffer();
			}
		}
		System.out.println("original:"+map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(map.containsKey(15 - entry.getKey())  && map.get(15 - entry.getKey())>0 && map.get(entry.getKey())>0) {
				System.out.println(entry.getKey()+" "+(15 - entry.getKey()));
				map.put(15 - entry.getKey(), map.getOrDefault(15 - entry.getKey(), 1)-1);
				map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 1)-1);
			}
		}
		System.out.println(map);

	}

	private static void findingPairThatSumToFive(String s) {
		//ip : "a12cf56ggg1g14ha1a3cd12qw4gff5"
		//output = 2,3;1,4
		//	ArrayList<Integer> map = new ArrayList<Integer>(); 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 

		for (int i = 0; i < s.length(); i++) {
			StringBuffer n = new StringBuffer();
			while(i < s.length() && Character.isDigit(s.charAt(i))){				
				n.append(s.charAt(i));
				i++;

			}
			if(!n.toString().isEmpty()) {
				map.put(Integer.valueOf(n.toString()), 
						map.getOrDefault(Integer.valueOf(n.toString()), 0)+1);
			}
		}
		System.out.println("original:"+map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(map.containsKey(15 - entry.getKey())  && map.get(15 - entry.getKey())>0 && map.get(entry.getKey())>0) {
				System.out.println(entry.getKey()+" "+(15 - entry.getKey()));
				map.put(15 - entry.getKey(), map.getOrDefault(15 - entry.getKey(), 1)-1);
				map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 1)-1);
			}
		}
		System.out.println(map);

	}

	private static void summingIntegersInString(String s) {

		int sum = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				//ifNumber
				while(i < s.length() && Character.isDigit(s.charAt(i))){
					sb.append(s.charAt(i));
					i++;
				}
				sum  = sum + Integer.valueOf(sb.toString());
				sb = new StringBuffer();
				//add to sum
			}
		}
		System.out.println(sum);

	}

	private static void printFormattedMultipleUnderscore(String s) {

		//Replace single underscore with space and multiple with full stop
System.out.println(s);
		StringBuffer sb = new StringBuffer();
		//	ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(!(s.charAt(i)=='_')) {
				sb.append(s.charAt(i));
			}else if(i < s.length()-1 && !(s.charAt(i+1)=='_')) {
				sb.append(' ');				
			}
			else {
				while(i < s.length()-1 && (s.charAt(i+1)=='_')) {
					i++;
				}
				sb.append('.');
			}
			
			
			
			
			
			
		}

		System.out.println(sb);



	}

	private static void printFormatted(String s) {
		//Replace single underscore with space and 2 with full stop
		System.out.println(s);
		char[] a = s.toCharArray(); 
		ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < a.length; i++) {
			if(!(s.charAt(i)=='_')) {
				list.add(s.charAt(i));
			}else if(i < a.length-1 && s.charAt(i+1)=='_' ) {
				i++;
				list.add('.');
			}else {
				list.add(' ');
			}
		}

		String output = list.stream().map(String::valueOf)
				.collect(Collectors.joining());
		System.out.println(output);

	}

	public static void anagram() {

		String[] input = new String[] {"cat", "tea", "apple", "ate", "tac", "act"};
		//String[][] output = new String
		HashMap<String, List<String>> output = new HashMap<String, List<String>>();

		for(int i=0; i<input.length; i++){
			// i = 0, 
			char[] inputElement = input[i].toCharArray();

			Arrays.sort(inputElement);  //inputElement =  [a,c,t] = act
			System.out.println(inputElement);

			if(output.containsKey(String.valueOf(inputElement))){
				List<String> stringList = output.get(String.valueOf(inputElement));   // {eat}
				stringList.add(input[i]);      // {eat, ate}

			}
			else{
				List<String> stringList = new ArrayList<String>();
				output.put(String.valueOf(inputElement), stringList);     // outmap  ==     {act, {cat, tac, act} }
				// {aet, {eat, ate}
				//{aelpp, {apple}}
				stringList.add(input[i]);
			}
		}
		System.out.println(output);

	}
}
