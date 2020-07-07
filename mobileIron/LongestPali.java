package mobileIron;

public class LongestPali {


	/*	"//longest palindrome in the input string"


//input : 123121
//output : 121 //*/


	public static void main(String[] args) {
		String s1 = "123121";
			//String s1 = "abbccccdccbedddaaabd";   // output : ccdcc
		System.out.println(longestPalindrome(s1));
	}

	private static int longestPalindrome(String num) {

		if(num.length()<=1){
			System.out.println(num);
			return num.length();
		}
		int maxPal = 0;
		int maxPalIndex = 0;
		for (int i = 0; i < num.length(); i++) {
			for (int j = 0; j < num.length(); j++) {
				if(i<=j && palindrome(num.substring(i, j+1))) {	
					if(maxPal<j-i+1) {
						maxPalIndex = i;
						maxPal = j-i+1;
					}
				}
			}
		}
		System.out.println(num.substring(maxPalIndex, maxPalIndex+maxPal));
		return maxPal;
	}

	private static boolean palindrome(String s) {
		for (int i = 0, j=s.length()-1; i < j; i++, j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean palindrome2(String s) {
		for (int i = 0, j=s.length()-1; i < j; i++, j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
}
