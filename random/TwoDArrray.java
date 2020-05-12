package random;

import java.util.Arrays;

public class TwoDArrray {
public static void main(String[] args) {
	
	int[][] array = new int[3][3];
	array = new int[][]{ {1,2, 3}, {4,5,6}, {7,8,9} };
	
	System.out.println(Arrays.deepToString(array));
	
	System.out.println(Arrays.asList(array));
	int[] a = new int[]{2,3,1};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	for(int i=0; i<3; i++){
		for(int j=0; j<3; j++){
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
	}
	
	
}
}
