package leetCode;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		int a[] = {99, 52, 4, 81, 3	};

		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-1; j++) {
					if( a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}	
				//System.out.println(Arrays.toString(a));
			}
		}
	//	System.out.println(Arrays.toString(a));
	}
}
