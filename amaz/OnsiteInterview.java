package amaz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class OnsiteInterview {

	public static void main(String[] args) {

	//	anagram();
		//	printFormatted("MI_is_one_of_the_best_place_to_work__It_is_nice__It_is_fun_");
		printFormattedMultipleUnderscore("MI_is_one_of_the_best_place_to_work____It_is_nice__It_is_fun__I_am_working_there_");

	//	summingIntegersInString("a12cfgh345a1a");
	}

	private static void summingIntegersInString(String s) {

		int sum = 0;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if(!Character.isDigit(s.charAt(i))) {
				//do nothing
			}else {
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

		StringBuffer sb = new StringBuffer();
		//	ArrayList<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(!(s.charAt(i)=='_')) {
				sb.append(s.charAt(i));
			}else if(i < s.length()-1 && !(s.charAt(i+1)=='_')) {
				sb.append(' ');				
			}else {
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

		//	System.out.println(list);

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
