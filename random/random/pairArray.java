package random;

import java.util.HashMap;

public class pairArray {
	
	public static void main(String[] args) {

		Integer[] array = new Integer[3];
		array = new Integer[]{ -62,2, 2, 3, 4,5,67,8,1,9,-4 };
		int sum =  5;
		//System.out.println(Arrays.deepToString(array));

		//System.out.println(Arrays.asList(array));
		//int[] a = new int[]{2,3,1};
		//Arrays.sort(a);

		//System.out.println(Arrays.toString(a));
		int pair=0;
//		for(int i=0; i<array.length-1; i++){
//			for(int j=i+1; j<array.length; j++){
//				//	System.out.print(array[i][j] + " ");
//				if(array[i] + array[j]==sum){
//					pair++;
//				}
//			}
//		}
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<array.length; i++){
			if(hm.containsKey(array[i])){
				hm.put(array[i], hm.get(array[i])+1);
			}else{
			hm.put(array[i], 1);
			}
		}
		
	//	Collections.sort(set);
		System.out.println("set"+hm);
	//	HashSet set = new HashSet<>(array);
	//	System.out.println(pair);
		for(int i=0; i<array.length; i++){
			if(hm.containsKey(sum-array[i])){
				System.out.println("Pair found.."+array[i] + " " + (sum-array[i]));
				pair++;
			}
		}
		System.out.println("Pair found.."+pair/2);
		
	}


}

