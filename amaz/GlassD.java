package amaz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class GlassD {
	
	
	public static void main(String[] args) {
		//	2. Pick 2 letter unique alphabet for all US states  
	//	pick2LetterUniqueAlpha();
	//	Given sides of a triangle write a function which could say it is equilateral ,
	//	isosceles or scalene. Give Test data for the solution you give
	//	typeOfTriangle(1,1,1);
	//	pick2LetterUniqueAlpha();
	//	System.out.println(firstOccurrenceNonRepeatingCharacterInString());
		
		reverseTheArrayOfChar();  
	}

	private static void reverseTheArrayOfChar() {
		
		char[] a = {'a', 'b', 'c', 'd'};
		
		for (int i = 0,j=a.length-1; i < a.length/2; i++, j--) {
			//take 1 indices, swap the first and last
			//and then incre 1st and decre last
			
		//	swap(i,j);
			a[i]=(char) (a[i]^a[j]);
			a[j]=(char) (a[i]^a[j]);
			a[i]=(char) (a[i]^a[j]);
		}
		
		System.out.println(Arrays.toString(a));
	}

	private static char firstOccurrenceNonRepeatingCharacterInString() {
		String s = "abcdefabcdf";
		//output = e
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		System.out.println(map);
		
		for (int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))==1){
				return s.charAt(i);
			}
		}
		System.out.println(map);
		return '\0';
		
	}

	private static void typeOfTriangle(int a, int b, int c) {
		
		if(a==b && a==c) {
			System.out.println("equi");
		}else if(a==b || b==c || a==c) {
			System.out.println("isoc");
		}else {
			System.out.println("sca");
		}
	//TD : all cases, negative numbers, 1 negative, 1 huge, not possible scenario	
	}

	private static void pick2LetterUniqueAlpha() {

		String s1 = "Wisconsin";
		String s2 = "New York";
		String s3 = "Minnesota";
		String s4 = "California";
		String s5 = "New Jersey";
		String s[] = {s1, s2, s3, s4, s5};

		HashSet<String> set = new HashSet<String>();

		for (String u : s) {
			int i=0,j=1;
			boolean found = false;
			
			do {
				if(!(set.contains(String.valueOf(u.charAt(i))+String.valueOf(u.charAt(j)))) && u.charAt(j)!=' ') {	
					System.out.println("Set contents:"+set);
					set.add(String.valueOf(u.charAt(i))+String.valueOf(u.charAt(j)));
					found = true;
				} else {
					System.out.println("incrementing:"+j);
					j++;
				}
			}while(found==false);
		}
		System.out.println(set);
	}
}
