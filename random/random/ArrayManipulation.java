package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayManipulation {

	public static void main(String[] args) {

		Integer[] array = new Integer[3];
		array = new Integer[]{ -62, 2, 2, 3, 4, 5, 67, 8, 1, 9, -4, 5 };		
		//	printDuplicates(array);

		String name ="DmhnaanhmD";
		//	reverseString(name);

		array = new Integer[]{ 1, 2, 2, 3, 4, 5, 9, 8, 1, 9, 9, 5 };		
		//	countSort(array, 10);

		//	fibonacci(10);

		String palindrome ="nursesrun1";
		//	palindrome(palindrome);

		String s1 ="abcd";
		String s2 ="dcef";
	//	stringUnion(s1, s2);
	//	stringUnionUsingSets(s1, s2);
		
		Integer arr1[] = {7, 1, 5, 2, 3, 6};
		Integer arr2[] = {3, 8, 6, 20, 7};
		
	//	arrayUnionUsingCollection(arr1, arr2);
	//	intersectionUsingSets(arr1, arr2);
		
		int arr3[] = {3, 8, 6, 20, 7, 21, 6,19};
		largestConsecutiveSum(arr3);
		int a = Integer.MIN_VALUE;
		
	}

	private static void largestConsecutiveSum(int[] a) {
	
		int len = a.length;
	//	Arrays.sort(arr3);
		int temp=0, sum, index = 0;
		for(int i=0; i<len-1; i++){
			
			sum = a[i]+a[i+1];
			if(temp<sum){
				temp=sum;
				index=i;
			}			
		}
		System.out.println(index);
		System.out.println(a[index] +" " + (temp-a[index]));
		
		
	}

	private static void intersectionUsingSets(Integer[] arr1, Integer[] arr2) {
	//	List allEle = Arrays.asList(arr1);
	//	allEle.addAll(Arrays.asList(arr2));
	//	List<Integer> allElements =  Arrays.stream( arr1 ).boxed().collect( Collectors.toList() );
	//	allElements.addAll(Arrays.stream( arr2 ).boxed().collect( Collectors.toList() ));
	//	allElements.removeAll(new ArrayList(arrayUnion(arr1, arr2)));
		
		List<Integer> allElements =  Arrays.asList(arr1);
		List<Integer> allElements1 =  Arrays.asList(arr2);
	//	allElements.addAll(allElements1);
		Collections.sort(allElements);
		System.out.println(allElements);		
	}

	private static HashSet arrayUnion(int[] arr1, int[] arr2) {
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		for(int i=0; i<arr1.length; i++){
			set.add(arr1[i]);
		}
		
		for(int i=0; i<arr2.length; i++){
			set.add(arr2[i]);
		}
		System.out.println(set);
		return set;		
	}
	
	private static void arrayUnionUsingCollection(int[] arr1, int[] arr2) {
		
		List<Integer> allElements =  Arrays.stream( arr1 ).boxed().collect( Collectors.toList() );
				//Arrays.asList(arr1);
		allElements.addAll(Arrays.stream( arr2 ).boxed().collect( Collectors.toList() ));
		
		System.out.println(new HashSet<>(allElements));		
	}

	private static void stringUnionUsingSets(String s1, String s2) {
		int index = 0;
		String s3 = s1.concat(s2);
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0; i<s3.length(); i++){
			
			set.add(s3.charAt(i));
			
		}
		
		System.out.println("String union..." + set);
		
	}

	private static void stringUnion(String s1, String s2) {
		
	//	List<Character> uniqueList =  Arrays.asList(s1.toCharArray());
//				Arrays.asList(uniqueList).removeAll(Arrays.asList(s2.toCharArray()));
//	System.out.println(Arrays.toString(uniqueList.toArray()));
				
				int index = 0;
		for(int i=s1.length()-1, j=0; j<s2.length(); j++,i--){
			
			if(! (s1.charAt(i)==s2.charAt(j))) {
				index = j;
				break;
			}
			
		}
		
		System.out.println("String union..." + s1+s2.substring(index));
		
	}

	private static void palindrome(String palindrome) {
		boolean palindromeFlag = false;
		for(int i=0,j=palindrome.length()-1; i<j; i++,j--){

			if(!(palindrome.charAt(i)==palindrome.charAt(j))){
				palindromeFlag = false;
				System.out.println("Not a palindrome");
				break;
			}else{
				palindromeFlag=true;
			}
		}
		if(palindromeFlag){
			System.out.println("Its a palindrome");
		}

	}

	private static void fibonacci(int n) {

		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+","+b);
		for(int i=0; i<n; i++){
			c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
		}


	}

	private static void countSort(Integer[] array, int range) {

		int countArray[] = new int[range];
		for(int i=0; i<array.length; i++){
			countArray[array[i]] ++;
		}

		int index = 0;
		for(int i=0; i<countArray.length; i++){

			for(int j=0; j<countArray[i]; j++){
				array[index] = i;
				index++;
			}
		}
		System.out.println("Sorted Array.."+Arrays.toString(array));

	}

	private static void reverseString(String name) {

		String reverse="";
		StringBuffer string = new StringBuffer();
		for(int i= name.length()-1; i >=0; i--){
			reverse = reverse+name.charAt(i);
			string.append(name.charAt(i));
			
		}

		System.out.println("reverse..."+reverse);
		System.out.println("string.."+string);
		System.out.println("string.."+string.reverse().toString().equals(name));

	}

	private static void printDuplicates(Integer[] array) {
		HashSet<Integer> set = new HashSet<Integer>();

		System.out.println("Arrray Size.."+array.length);
		ArrayList<Integer> list = new ArrayList<Integer>();
		//HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++){
			if(!set.contains(array[i])){
				set.add(array[i]);
			}else{
				list.add(array[i]);
			}
		}
		System.out.println("Duplicate Array.."+Arrays.toString(list.toArray()));

	}
}

