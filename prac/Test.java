package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;


/*Input: "pwwkew"
Output: 3
Explanation: The answer is "wke",
 */

public class Test {
	public static void main(String[] args) {


		//System.out.println(lengthOfLongestSubstring(" "));		
		//	 System.out.println(isValidExpression());
		//	System.out.println(isValidExpression1());		
		//	System.out.println(largestSmallestWithoutMinMax());

		//	System.out.println(sumOfNumbersInString());

		//	System.out.println(isPalindrome());
		//	singleton();
		//	firstMissingPositive();		
		//HashMap<Integer, Integer> map = singleNumber();
		//sortByKey(map);
		//sortByValue(map);
	//	longestCommonPrefix();
		numberPalindrome();

	}

	private static void numberPalindrome() {
		
		int origNum = 3123213;
		int num = origNum;
		int divisor = 1;
		
		while(num >10) {
			divisor = divisor * 10;
			num = num/10;
		}
		System.out.println("divisor: "+divisor);
		num = origNum;
		while(divisor!=1) {
			int l = num/divisor;
			int r = num % 10;
			System.out.println("l: "+l+"r: "+r);
			if(l!=r) {				
				System.out.println("not pali");
				return;
			}
			num = num / 10 - (l * divisor/10);
			divisor = divisor/100;
		}
		System.out.println("pali");
		return;
		
	}

	private static void longestCommonPrefix() {
		String[] s = {"fl1ower","fl1ow","fl1ight"};
	            boolean completeFlag = false;           
	             String c = "";
	            for (int i=0; i < s[0].length(); i++) { // i denotes first letter
	                for (int j=0; j < s.length-1; j++) {  // j denotes the string num                 
	                	System.out.println("i: "+i+" j: "+j);
	                    if(  s[j].length()==(i+1) || s[j+1].length()==(i+1) || !(s[j].charAt(i)==s[j+1].charAt(i))){ 
	                        completeFlag =  true;
	                        break;
	                    }
	                }                
	                if(completeFlag){
	                    break;
	                }
	                c = c + s[0].charAt(i);          
	         }        
	        System.out.print(c);
	    }
		
	

	private static void sortByValue(HashMap<Integer, Integer> map) {


		HashSet<Map.Entry<Integer, Integer>> set = new HashSet<>(map.entrySet());
		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {					
				return o1.getValue().compareTo(o2.getValue());
			}			
		});

	//	Iterator<Map.Entry<Integer, Integer>> itr = list.iterator();
		LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<Integer, Integer>();
		for(Map.Entry<Integer, Integer> itr:list) {
		//	Map.Entry<Integer, Integer> entry = itr.next();
			map1.put(itr.getKey(), itr.getValue());
		}
		System.out.println("map after value sort:"+map1);		
	}

	private static void sortByKey(HashMap<Integer, Integer> map) {
		System.out.println("map bfore key sort:"+map);
		HashMap<Integer, Integer> sortmap = new  HashMap<Integer, Integer>(map);
		System.out.println("map after key sort:"+sortmap);		
	}

	private static HashMap<Integer, Integer> singleNumber() {
		int[] nums = {2,2,1,3,4,4,4,4,1,5};
		HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();


		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}
		return map;

	}



	private static void firstMissingPositive() {
		int nums[] = {1,2,0};
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i=0; i < nums.length; i++) {

			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i])+1);
			}else{
				map.put(nums[i], 1);
			}
		}
		//   
		int i=0;

		while(i<nums.length){

			if(!map.containsKey(i)){
				System.out.println(i);

			}  	i++;          
		}
		System.out.println(i); 

	}

	private static void singleton() {
		SingletonClass sc = SingletonClass.getInstance();
		sc.i = 1;
		System.out.println(sc.i);

	}
	private static boolean isPalindrome() {
		// TODO Auto-generated method stub
		String s = "lev1vel";

		for(int i=0,j=s.length()-1; i<j;i++, j--) {

			if(!(s.charAt(i)==s.charAt(j))) {
				return false;
			}
		}
		return true;

	}
	private static int sumOfNumbersInString() {
		String s = "11W22og66y11i1";

		int sum = 0; int temp = 0;
		for(int i=0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				temp = temp*10 + Character.getNumericValue(s.charAt(i));			
			}
			if(! Character.isDigit(s.charAt(i)) || i==(s.length()-1)){
				sum = sum + temp;
				temp = 0;
			}			
		}		
		return sum;
	}
	private static Object largestSmallestWithoutMinMax() {

		int a[] = {3, 8, 2, 5, 9, 7, 6, 4};

		System.out.println(Arrays.toString(a));
		return null;
	}
	private static boolean isValidExpression() {
		String ex = "((x+y)))";
		System.out.println(ex);
		Stack<Character> s = new Stack<Character>();
		int i=0;
		while(i<ex.length()) {

			while(ex.charAt(i)!=')') {
				s.push(ex.charAt(i));
				System.out.println("pushed:"+ex.charAt(i));
				System.out.println("Stack:"+s);
				i++;
			}
			do {
				System.out.println("element to be popped:"+s.peek());	
				s.pop();

				System.out.println("Stack:"+s);
			}while(!(s.peek()=='('));
			s.pop();
			i++;

		}
		if(s.size()==0) {
			return true;
		}
		return false;

	}
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<Character>();
		int i =0;
		int j= 0;
		int temp = 0;
		int r = 0;
		while(j<s.length()){

			if(!set.contains(s.charAt(j))){    
				set.add(s.charAt(j));
				r = Math.max(r, set.size());
				j++;
				System.out.println("Hi"+set);
			}else{
				set.remove(s.charAt(i));
				i++;
			}          
		}

		return r;
	}
}