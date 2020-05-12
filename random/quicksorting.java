package random;

import java.util.Arrays;

public class quicksorting {

	public static void main(String[] args){
		
		int arr[] = {11,3,2,1,12, 5,6, 9,8,14,0};
		
		quickSort(arr, 0, 6);
		
//		for(int i:arr){
//			System.out
//		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

	private static  void quickSort(int[] arr, int low, int high) {
		
		if(low<high){
			
			int pi = partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {


		int pivot = arr[high];
		//try sorting from left and end
		int i=low, j=high-1;
		while( i <j){

			if(arr[i]>pivot){
				if(arr[j]>pivot){
					j--;
				}else{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
					i++;
					j--;
				}
			}else{
				i++;
			}
		}

		int temp = arr[high];
		arr[high] = arr[i];
		arr[i] = temp;

		return i;
	}
}
