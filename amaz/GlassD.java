package amaz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GlassD {


	public static void main(String[] args) {
		//	2. Pick 2 letter unique alphabet for all US states  
		//	pick2LetterUniqueAlpha();
		//	typeOfTriangle(1,1,1);
		//	pick2LetterUniqueAlpha();
		//	System.out.println(firstOccurrenceNonRepeatingCharacterInString());
		//	reverseTheArrayOfChar();  
		notSortedThirdLargestValue();
		secondLargestValue();
		//mergeSortedArray();
		//	sortArray();
		//	quickSort();

		//Dont try to solve merge sort now, too much intricacies, just check the algo
		//	int a[] = {5,2,3,1};
		//	mergeSort(a, 0, a.length-1);
		//	System.out.println(Arrays.toString(a));

		System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));

		//rajat 5 times array rotate

	//	rotateArray(1);
		rotateArrayMultipleTimes(3);
	}


	private static void rotateArrayMultipleTimes(int times) {
		int[] a = new int[]{1,2,3,4,5,6,7};
		int[] output = new int[a.length];

		//rotate right side
		//save the  last, keep moving till first and put last in first
		int last = a[a.length-1];
		for (int i = a.length-times, j=0; i <= a.length-1; i++, j++) {
			output[j]=a[i];
		}
		
		for (int i = 0, j=times; j <= a.length-1; i++, j++) {
			output[j]=a[i];
		}
		System.out.println(Arrays.toString(output));
		
	}


	private static void rotateArray(int t) {
		int[] a = new int[]{1,2,3,4,5,6,7};

		//rotate right side
		//save the  last, keep moving till first and put last in first
		int last = a[a.length-1];
		for (int i = a.length-1; i > 0; i--) {
			a[i]=a[i-1];
		}
		a[0]=last;
		
		System.out.println(Arrays.toString(a));
		
		a = new int[]{1,2,3,4,5,6,7};

		//rotate left side
		//save the  first, keep moving till first and put first in last
		int first = a[0];
		for (int i = 1; i <= a.length-1; i++) {
			a[i-1]=a[i];
		}
		a[a.length-1]=first;
		
		System.out.println(Arrays.toString(a));
	}


	private static void secondLargestValue() {

		// int a[] = {13, 3, 4, 20, -3, 11};
		// int a[] = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
		int a[] = {5,2,2,1,4};

		Integer max =null;
		Integer second_max = null;

		for (Integer num:a) {
			System.out.println("Verifying num:"+num);

			if(num.equals(max) || num.equals(second_max)) {
				continue;
			}

			if(max==null || num>max) {
				System.out.println("putting max"+num);
				System.out.println("putting second_max"+max);
				second_max=max;
				max=num;
			}else if (second_max==null || num>second_max) {
				System.out.println("putting secondmax"+second_max);
				second_max=num;				
				//traverse thru each loop, if the element is greater than l, then l = element 
				//else if element <l but greater than sl then sl = ele
				//else if element <sl but greater than tl then tl = ele
			}
		}
		if(second_max==null) {
			second_max = max;
		}


		System.out.println("second_max"+second_max);
		System.out.println("max"+max);

	}


	private static void mergeSort(int[] a, int l, int r ) {

		if(l<r) {
			int m = l+(r-l)/2;
			//sort first half
			mergeSort(a, l, m );
			//sort the second half
			mergeSort(a, m+1, r );
			//merge the sorted halves
			merge(a, l, m, r);
		}
	}


	private static void merge(int[] a, int l, int m, int r) {

		int L[] = new int[m-l+1];
		for (int i = 0; i < L.length; i++) {
			L[i] = a[i];
		}
		int R[] = new int[r-m];
		for (int i = 0; i < R.length; i++) {
			R[i] = a[m+i+1];
		}


		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = l;
		while (i < L.length && j < R.length) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			}
			else {
				a[k] = R[j];
				j++;
			}
			k++;
		}


		while (i < L.length) {
			a[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < R.length) {
			a[k] = R[j];
			j++;
			k++;
		}


	}


	private static void quickSort() {
		int a[] = {5,2,3,1};
		int n[] = new int[100000];
		for (int i = 0; i < a.length; i++) {
			n[5000+a[i]]++;
		}
		for (int i = 0,j=0; i < n.length && j<a.length; i++) {
			while(n[i]>0) {
				a[j]=i-5000;
				n[i]--;
				j++;
			}
		}

		System.out.println(Arrays.toString(a));

	}


	private static void sortArray() {
		int a[] = {5,2,3,1};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}

		}
		System.out.println(Arrays.toString(a));

	}


	private static void mergeSortedArray() {
		//https://leetcode.com/problems/merge-sorted-array/
		int a[] = {1,2,3,0,0,0}  ;
		int m = 3;
		int b[] = {2,5,6};
		int n = 3;

		//traverse thru the array b and a simultaneously, and keep merging the b, while moving the towards right by 1
		int j = 0, i=0;
		while (j < b.length&&i<a.length) {
			if(b[j]<a[i]) {
				//shift the array to right
				shiftRightFrom(i, a);
				a[i]=b[j];
				j++;
			}
			i++;
		}
		for (int k = j; k < b.length; k++) {
			a[a.length-b.length+k]=b[k];

		}


		System.out.println(Arrays.toString(a));

	}


	private static void shiftRightFrom(int i, int[] a) {
		System.out.println("Shifted array");
		for (int j=a.length-1; j > i; j--) {
			a[j]=a[j-1];
		}
		System.out.println(Arrays.toString(a));
	}


	public static int longestConsecutive(int[] a) {
		//Approach 1
		//sort the array, traverse it, store the max length and return

		/*		if(a.length==0){
			return 0;
		}else if(a.length==1){
			return 1;
		}
		int r=0;
		Arrays.parallelSort(a);
		for (int i = 0; i < a.length-1; i++) {
			int temp = 0;
			while((i+1) < a.length && (a[i+1]==a[i]+1 || a[i+1]==a[i])) {
				if(a[i+1]==a[i]+1) {
					temp++;
				}
				i++;
			}
			//if the number is duplicate, just skip it and continue incrementing temp
			r = Math.max(r, temp+1);
		}
		return r; */

		//Approach 2
		//100 - 1
		//4 - 1
		Set<Integer> num_set = new HashSet<Integer>();
		for (int num : a) {
			num_set.add(num);
		}

		int longestStreak = 0;

		for (int num : num_set) {
			if (!num_set.contains(num-1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (num_set.contains(currentNum+1)) {
					currentNum += 1;
					currentStreak += 1;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;

	}

	private static void notSortedThirdLargestValue() {

		//	int a[] = {13, 3, 4, 20, -3, 11};
		//	int a[] = {-2147483648,-2147483648,-2147483648,-2147483648,1,1,1};
		int a[] = {5,2,2, 1, 4};

		Integer max =null;
		Integer second_max = null;
		Integer third_max = null;

		for (Integer num:a) {

			if(num.equals(max) || num.equals(second_max) || num.equals(third_max)) {
				continue;
			}

			if(max==null || num>max) {
				third_max=second_max;
				second_max=max;
				max=num;
			}else if (second_max==null || num>second_max) {
				third_max=second_max;
				second_max=num;				
			}else if(third_max==null || num>third_max) {
				third_max=num;
			}
			//traverse thru each loop, if the element is greater than l, then l = element 
			//else if element <l but greater than sl then sl = ele
			//else if element <sl but greater than tl then tl = ele
		}

		if(third_max==null) {
			third_max = max;
		}
		if(second_max==null) {
			second_max = max;
		}

		//	System.out.println(l);
		System.out.println("second_max"+second_max);
		System.out.println("third_max"+third_max);
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
