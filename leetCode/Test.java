package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		//First Unique Character in a String
	//	System.out.println(firstUniqChar("leetcode"));

		//Valid Anagram
	//	System.out.println(isAnagram("anagram", "nagaram"));		
		//Remove Duplicates from Sorted Array
	//	removeDuplicatesFromSortedArray();
System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

	}
	
	  public static boolean isPalindrome(String s) {
		  
		  for(int i = 0, j=s.length()-1; i<j; ) {
			  while(! Character.isDigit(s.charAt(i)) || !Character.isAlphabetic(s.charAt(i))) {
				  i++;
			  }
			  while(! Character.isDigit(s.charAt(j)) || !Character.isAlphabetic(s.charAt(j))) {
				  j--;
			  }
			  if(!String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j)))){
				  return false;
			  }
		  }
		return true;
	        
	    }


	private static void removeDuplicatesFromSortedArray() {
		int[] a = {0,0,1,1,1,2,2,3,3,4};
		int i = 0 ; int j=1;
	    while (j < a.length ) {	    
	    	System.out.println(Arrays.toString(a));
			if(a[i] == a[j]) {
				a[i] = a[j];
				j++;
				continue;
			}	
			Arrays.toString(a);
			j++;
			i = j-1;			
		}	
	    System.out.println(j-1);
	}


	public static int firstUniqChar(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				char c = s.charAt(i);
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))==1) {
				return s.indexOf(s.charAt(i));
			}
		}
		return -1;
	}

	public static boolean isAnagram(String s, String t) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {			
				char c = s.charAt(i);
				map.put(c, map.getOrDefault(c, 0)+1);
			
		}
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if(! map.containsKey(c)) {
				return false;
			}else {				
				map.put(c, map.get(c)-1);
			}			
			if(map.get(c)==0) {
				map.remove(c);
			}
		}
		if(map.isEmpty()) {
			return true;
		}

		return false;

	}
}
