package interview;

public class Test {


	//given the list of integers
	//second largest integer	
	public static void main(String[] args) {

		int[] a = {1,43,43,5,7,4,2,43};
		//output -- 7

		int largest = Integer.MIN_VALUE;
		int seclarge = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if(a[i]>largest) {
				seclarge = largest;
				largest = a[i];
			}else if(a[i]>seclarge && a[i]!=largest) {
				seclarge = a[i];
			}
		}

		System.out.println(seclarge);

	}
}
