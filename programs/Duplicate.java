package programs;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicate {

	
	public static void main(String[] args){
		int a[] = {1,2,2,3,4,4};

		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> duplicateElements = new ArrayList<Integer>();

		for(int i=0; i<a.length;i++){

		int setSizeBeforeAdding = set.size();
		set.add(a[i]);    // 1
		int setSizeAfterAdding = set.size();
		if(setSizeBeforeAdding == setSizeAfterAdding){
			System.out.println("Duplicate element found:"+a[i]);
			duplicateElements.add(a[i]);		}

		System.out.println("Duplicate element :"+duplicateElements.toString());
		}
	}
}
