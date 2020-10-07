package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Test {	

	public static void main(String[] args) {

		//	occurenceofString();
		occurenceOfAllUniqueStrings();

		//	occurenceUnique();
		//	xorCheck();
		//	swapNumWithXor();
		//	swapStringWithXor();

		//	swapStringWithoutThirdVar();
		//	reverseStringWithoutThirdVar();

		//	arrayRotate();
		//	 secondLargestInArray();
		//	System.out.println(fibonacciUsingRecursion(6));
		//	moveEvenLeftInArray();
	//	convertDecimalToBinary(33);
	//	swapStringPart();
		//evenOddFromList();
//		removingDuplicatesFromString();
	//	removingDuplicatesFromStringWithoutSet();
		sumOfIntegersInString();
	//	checkPalindrome();
	}

	

	private static void occurenceOfAllUniqueStrings() {
		String name = "the quick brown fox jumped upon the lazy black dog";

		//outpu = the:2, quick:1....

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String[] words = name.split(" ");

		for(String word: words){

			if(!map.containsKey(word)){
				map.put(word, 1);
			}else{    
				map.put(word, map.get(word)+1)  ;
			}
		}

		System.out.println(map);

	}



	private static void checkPalindrome() {
		String s = "geeeeg";
		boolean flag = true;
		for(int i=0, j=(s.length()-1); i<j;i++,j-- ){
			if(!(s.charAt(i)==s.charAt(j))){
				flag = false;
				break;
			}
		}
		
		System.out.println(flag ? "Palindrome":"Not Plaindrome");
		
		System.out.println(s.matches("[a-zA-Z0-9]"));
		
	}



	private static void sumOfIntegersInString() {
		String s = "1abc2x30yz67";
		//Output: 24
		
		int sum = 0;
		int num =0;
		for(int i = 0; i<s.length();){
			
			while(i<s.length() && Character.isDigit(s.charAt(i)) ){
				num = num * 10 + Integer.parseInt(String.valueOf(s.charAt(i)));
				System.out.println("iteration: "+i + ":"+num);
				i++;
			}
			System.out.println("iteration outside while: "+i + ":"+num);
			sum = sum +num;
			num = 0;			
			i++;
		}
		System.out.println(sum);
	}



	private static void removingDuplicatesFromString() {
		
		String s = "bcabc";
		//output = "bca"
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(char c : s.toCharArray()){
			set.add(c);
		}
		
		System.out.println(set.toString().replaceAll("[\\[\\], ]", ""));
		
	}

	private static void swapStringPart() {
		String s = "finra.org";

		StringBuffer sb = new StringBuffer();
		System.out.println(s);
		System.out.println(s.split("\\.")[0]);
		sb.append(s.split("\\.")[1]+"."+s.split("\\.")[0]);
		System.out.println(sb.toString());
	}

	private static void convertDecimalToBinary(int i) {
	}

	private static void moveEvenLeftInArray() {
		int a[] = {1,2,3,4,5,6, 8,8,8,1,2,3,3,4};

		int j = 0; 
		int k = a.length-1;

		for(int i=0; i<a.length && i<k; ){	

			if(!(a[i]%2==0)){
				j = a[i];
				a[i] = a[k];
				a[k] = j;
				k--;
			}else{
				i++;
			}
		}		
		System.out.println(Arrays.toString(a));
	}

	private static int fibonacciUsingRecursion(int n) {
		// f(n)=f(n-1)+f(n-2)
		if(n==1 || n==2){
			return 1;
		}else{
			return fibonacciUsingRecursion(n-1)+fibonacciUsingRecursion(n-2);
		}

	}

	private static void evenOddFromList() {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		System.out.println(list.size());

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()){
			System.out.println(itr.next());
		}


	}

	private static void secondLargestInArray() {
		int []  a = {8,9,8,10,7,1,2,6,9,3,4,5,10};

		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i=0; i<a.length; i++){			
			if(a[i]>largest){
				secondLargest = largest;
				largest = a[i];
			}else if(a[i]>secondLargest){
				secondLargest = a[i];
			}

		}
		System.out.println("largest: "+largest);
		System.out.println("secondLargest: "+secondLargest);
	}

	private static void arrayRotate() {
		int []  a = {1,2,3,4,5};

		int temp = a[0];
		for(int i=0; i<4; i++){			
			a[i]=a[i+1];	
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));

	}

	private static void occurenceUnique() {

		final String  name ="GeeksForGeeks";

		// for
		HashMap<Character, Integer> occurenceOf = new HashMap<Character, Integer>();

		for(int i=0; i<name.length(); i++){			

			if(! occurenceOf.containsKey(name.charAt(i))){
				occurenceOf.put(name.charAt(i), 1);
			}else {
				int value = occurenceOf.get(name.charAt(i));
				occurenceOf.put(name.charAt(i), value+1);
			}
		}
		System.out.println(occurenceOf);		
		for(Map.Entry<Character, Integer> entry : occurenceOf.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry);
			}
		}
	}

	private static void reverseStringWithoutThirdVar() {
		String a = "abcd";
		char[] r = a.toCharArray();

		for(int i=0, j=r.length-1; i<j; i++,j--){
			r[i]=(char) (r[i]^r[j]);
			r[j]=(char) (r[i]^r[j]);
			r[i]=(char) (r[i]^r[j]);
			System.out.println(r[i]);
		}
	}

	private static void swapStringWithoutThirdVar() {		
		String a = "abcd";
		String b = "defgh";

		a = a+b;
		//	b=a.substring(a.length()-)				
	}

	private static void swapStringWithXor() {
		char[] a = {'a','b','c'};
		char[] b = {'a','b','c'};

		//		a = a^b;
		//		b = a^b;
		//		a = a^b;

		System.out.println(a);
		System.out.println(b);

	}

	private static void swapNumWithXor() {
		int a = 10;
		int b = 16;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		a = a^b;
		System.out.println("First XOR a = a^b" + Integer.toBinaryString(a));
		b = a^b;
		a = a^b;

		System.out.println(a);
		System.out.println(b);

	}

	private static void xorCheck() {
		System.out.println(2^2);
		System.out.println(2^0);
		System.out.println(2^5);

	}

	private static void occurenceofString() {

		final String  name ="Harshit Jain";
		String s2 = "ars";
		// a= 2, r = 1, s = 1
		HashMap<Character, Integer> occurenceOf = new HashMap<Character, Integer>();

		for(int i=0; i<s2.length(); i++){
			for(int j=0; j<name.length(); j++){

				if(s2.charAt(i)==name.charAt(j)){

					if(! occurenceOf.containsKey(s2.charAt(i))){
						occurenceOf.put(s2.charAt(i), 1);
					}else {
						int value = occurenceOf.get(s2.charAt(i));
						occurenceOf.put(s2.charAt(i), value+1);
					}
				}
			}
		}
		System.out.println(occurenceOf);		
		for(Map.Entry<Character, Integer> entry : occurenceOf.entrySet()){

		}
	}


}