package interviewCake;

import java.util.Arrays;
import java.util.Random;

//You have a function rand5() that generates a random integer from 1 to 5. 
//Use it to write a function rand7() that generates a random integer from 1 to 7.
public class RandomTest {

	
	public static void main(String[] args) {
		
		System.out.println(rand7());
		int[] a = new int[7];
		for (int i = 0; i < 10000; i++) {
			a[rand7()]++;
		}
		
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < 10000; i++) {
			a[rand7()]++;
		}
		
		System.out.println(Arrays.toString(a));
	
	}

	private static int rand7() {
		while(true) {	 
			int roll1 = rand5();
			int roll2 = rand5();
			
			int outcome = roll1*5 + roll2*5;
			
			if(outcome>49) {
				continue;
			}
			return (outcome % 7) ;
		}
		
	}

	private static int rand5() {
		
		Random rand = new Random();
		int x = rand.nextInt(6);
		return x;
		
	}
}
