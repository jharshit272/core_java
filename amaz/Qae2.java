package amaz;

import java.util.Arrays;

public class Qae2 {


	public static void main(String[] args) {


		//mergeSort3Array();

		//	reverseCharArrayWithoutSpaces();
		//	System.gc(); 
		//	 Runtime.getRuntime().gc(); 
		//	 System.runFinalization(); 

		//	removeDuplicateWithoutExtraSpace();

		//x1, y1, x2, y2, x3, y3, x4, y4
		// 2 of x are equal, 2 of y are equal

		//create hashmap, put x, y and correspondin occurence


		//	reverseSentence();
		//	System.out.println(search());
		//equilibrium index of a integer array
		System.out.println(pivot());

		sumNumbersInString();
		
		LongestPalindromicSubstring();

		//TODO: Behavioral questions such as examples of situations…
	//TODO	Write test cases for Amazon Prime functionality
	//TODO	You built an application like google drive. State the test cases
		//Selenium program to automate Facebook login, search a friend and send friend request
		//prepare questions to ask
	}

	private static void LongestPalindromicSubstring() {
		
		String s = "babad";
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i; j < s.length(); j++) {
			//	if(ispalindrome(s.substring(i,j)){
			//		Math.max(ma )
				}
			}
		}
		
		


	private static void sumNumbersInString() {
		String s = "ab50dt60h4q";
		int sum = 0;
		String num ="0";
		for (int i = 0; i < s.length(); i++) {
			
			if(Character.isDigit(s.charAt(i))) {
				num+=s.charAt(i);
			}else {
				sum+=Integer.parseInt(num);
				num = "0";
			}
			System.out.println(sum);
		}
	}

	//	private static void sumNumbersInString() {
	//		String s = "ab50dt60h4q"; //output = 24
	//		int sum = 0;
	//		for (int i = 0; i < s.length(); i++) {
	//			//keep traversing the string, as i find a integer, I would 
	//			//again traverse it till I encounter another string and then
	//			//i would add it to the next number
	//			String num = "";
	//			while(i<s.length() && Character.isDigit(s.charAt(i)) ) {
	//				num +=s.charAt(i);
	//				i++;
	//			}
	//			if(num!="")
	//				sum+=Integer.parseInt(num);
	//
	//		}
	//		System.out.println(sum);
	//	}

	private static int pivot() {
		int nums[] = {-1,-1,-1,-1,-1,0};
		int l = 0;
		int r = nums.length-1;
		int sumLeft = 0;
		int sumRight = 0;
		while(l<=r) {
			if(sumLeft==sumRight && l==r) {
				return l;
			}else if(sumLeft<=sumRight) {				
				sumLeft += nums[l];
				l++;
			}else {
				sumRight += nums[r];
				r--;
			}			
		}

		l = 0;
		r = nums.length-1;
		sumLeft = 0;
		sumRight = 0;
		while(l<=r) {
			if(sumLeft==sumRight && l==r) {
				return l;
			}else if(sumLeft>sumRight) {				
				sumLeft += nums[l];
				l++;
			}else {
				sumRight += nums[r];
				r--;
			}			
		}

		return -1;
	}

	public static int search() {
		int[] nums = {1,0,3,5,9,12};
		int target = 9;
		int l = 0;
		int r = nums.length-1;
		while(l<r) {
			int m = (l+r)/2;

			if(nums[m]==target) {
				return target;
			}else if(nums[m]>target) {

				r = m-1;
			}else {
				l=m+1;
			}
		}


		return -1;



	}

	private static void reverseSentence() {
		String s = "Hello Good Morning";
		//o = "Morning Good Hello"

		StringBuffer result = new StringBuffer();
		int i = s.length()-1;
		int end = s.length();


		while(i>0) {
			if(s.charAt(i)==' ' ) {
				int start = i+1;
				while(start<end) {
					result.append(s.charAt(start));					
					start++;
				}
				result.append(' ');
				end = i;
			}
			i--;
		}

		int start = i;
		while(start<end) {
			result.append(s.charAt(start));
			start++;
		}

		System.out.println(result);

	}

	private static void removeDuplicateWithoutExtraSpace() {


		char[] a = {'a','a','a','b','b','c','c','d'} ;

		int j = 0;
		for (int i = 1; i < a.length; i++) {
			if(a[i]!=a[j]) {
				a[j+1]=a[i];
				j++;
				i++;
			}else {
				i++;
			}
		}
		System.out.println(j);

		System.out.println(Arrays.toString(a));
	}

	private static void reverseCharArrayWithoutSpaces() {
		char[] c =  new char[]{'A' , ' ', 'B', ' ', 'C', 'D', ' ', 'E', 'F'};

		int i=0; int l = c.length-1;

		for (i = 0; i < l; i++,l--) {

			while(i<l && ((c[i]==' ') || (c[l]==' '))) {
				if((c[i]==' ')) {
					i++;
				}
				if((c[l]==' ')) {
					l--;
				}
			}

			c[i]=(char) (c[i]^c[l]);
			c[l]=(char) (c[i]^c[l]);
			c[i]=(char) (c[i]^c[l]);
		}

		System.out.println(Arrays.toString(c));
	}

	private static void mergeSort3Array() {
		int[] A = {1,2,3};
		int[] B = {2,2,3};
		int[] C = {3,3,3};

		int D[] = new int[A.length+B.length+C.length];
		int i=0,j=0, k=0, l=0;


		while(i<A.length && k<C.length && j<B.length) {

			int a = A[i]; 
			int b = B[j]; 
			int c = C[k];

			if(a<=b && a<=c) {

				D[l]=A[i];
				i++;

			}else if(c<=a && c<=b) {

				D[l] = C[k];
				k++;

			}else {

				D[l] = B[j];
				j++;

			}
			l++;


		}

		System.out.println(Arrays.toString(D));

		while(i<A.length && j<B.length) {
			if(A[i]<B[j]) {
				D[l]=A[i];
				i++;
			}else {
				D[l]=B[j];
				j++;			
			}
			l++;
		}

		while(j<B.length && k<C.length) {
			if(B[j]<C[k]) {
				D[l]=B[j];
				j++;
			}else {
				D[l]=C[k];
				k++;			
			}
			l++;
		}

		while(i<A.length && k<C.length) {
			if(A[i]<C[k]) {
				D[l]=A[i];
				i++;
			}else {
				D[l]=C[k];
				k++;			
			}
			l++;
		}



		System.out.println(Arrays.toString(D));
	}
}
