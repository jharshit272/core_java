package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {


		//	Remove Duplicates from Sorted Array
	//	removeDuplicatesFromSortedArray();

		
	//	Contains Duplicate
	//	containsDuplicate(new int[] {1,2,3});


		//First Unique Character in a String
		//	System.out.println(firstUniqChar("leetcode"));

		//Valid Anagram
		//	System.out.println(isAnagram("anagram", "nagaram"));		
		//Remove Duplicates from Sorted Array
		//	removeDuplicatesFromSortedArray();
	//	System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		
//		Intersection of Two Arrays
	//	intersect(new int[] {1,2,3}, new int[] {1,2,3});
		
//		Intersection already sorted Two Arrays -- out put = {1,2,3.3}
		intersectAlreadySorted(new int[] {1,2,2,3,3}, new int[] {1,2,3,3,4});
		intersectBetter(new int[] {1,3,3,2,2}, new int[] {1,3,4,2,3,4});

	}
	
	
	private static void intersectBetter(int[] a1, int[] a2) {
		
		if(a1.length>a2.length) {
			intersectBetter(a2, a1);
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int ele:a1) {
			map.put(ele, map.getOrDefault(ele, 0)+1);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		for(int ele:a2) {
			if(map.containsKey(ele) && map.get(ele)>0){
				list.add(ele);
				map.put(ele, map.get(ele)-1);
			}
		}
		System.out.println(list);
	}


	private static void intersectAlreadySorted(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i=0, j=0;
		List<Integer> list = new ArrayList<Integer>();
		while(i<nums1.length && j<nums2.length) {
			
			if(nums1[i]==nums2[j]) {
			list.add(nums1[i]);	
			i++;
			j++;
			}else if(nums1[i]<nums2[j]) {
				i++;
			}else {
				j++;
			}			
		}
		
		int result[] = new int[list.size()];
		int k=0;
		for(Integer ele : list) {
			result[k++]=ele;
		}
		System.out.println(Arrays.toString(result));
	}
	
	


	public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> num = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(!num.add(nums[i])){
                return true;
            }
        }
        return false;
    }


	public int removeDuplicates(int[] a) {
		if(a.length<=1){
			return a.length;
		}
		int i=0;
		for(int j=1; j<a.length; j++){
			if(a[i]!=a[j]){
				a[i+1]=a[j];
				i++;
			}
		}

		return i+1;
	}

	public static boolean isPalindrome(String s) {

		for(int i = 0, j=s.length()-1; i<j; ) {
			while(! Character.isDigit(s.charAt(i)) || !Character.isAlphabetic(s.charAt(i))) {
				i++;
			}
			while(! Character.isDigit(s.charAt(j)) || !Character.isAlphabetic(s.charAt(j))) {
				j--;
			}
			if(!String.valueOf(s.charAt(i)).equalsIgnoreCase(String.valueOf(s.charAt(j)))){
				return false;
			}
		}
		return true;

	}


	private static void removeDuplicatesFromSortedArray() {
		int[] a = {0,0,1,1,1,2,2,3,3,4};
		int i = 0 ; int j=1;
		while (j < a.length ) {	    
			System.out.println(Arrays.toString(a));
			if(a[i] == a[j]) {
				a[i] = a[j];
				j++;
				continue;
			}	
			Arrays.toString(a);
			j++;
			i = j-1;			
		}	
		System.out.println(j-1);
	}


	public static int firstUniqChar(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				char c = s.charAt(i);
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if(map.get(s.charAt(i))==1) {
				return s.indexOf(s.charAt(i));
			}
		}
		return -1;
	}

	public static boolean isAnagram(String s, String t) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {			
			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);

		}
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if(! map.containsKey(c)) {
				return false;
			}else {				
				map.put(c, map.get(c)-1);
			}			
			if(map.get(c)==0) {
				map.remove(c);
			}
		}
		if(map.isEmpty()) {
			return true;
		}

		return false;

	}
	
	
	public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<nums1.length; i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i])+1);
            }else{
               map1.put(nums1[i], 1);
            }
        }
        
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums2.length; i++){
            if(map2.containsKey(nums2[i])){
                map2.put(nums2[i], map2.get(nums2[i])+1);
            }else{
               map2.put(nums2[i], 1);
            }
        }        
        System.out.println(map1);
        System.out.println(map2);
        HashMap<Integer, Integer> map3 = new HashMap<Integer, Integer>();
        
        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            if(map2.containsKey(entry.getKey())){
                map3.put(entry.getKey(), Math.min(map1.get(entry.getKey()), map2.get(entry.getKey())));
            }          
        }        
        System.out.println(map2);
        ArrayList<Integer> list = new ArrayList<Integer>();
         for(Map.Entry<Integer,Integer> entry : map3.entrySet()){
             for(int i=0; i<entry.getValue(); i++)
                list.add(entry.getKey());
          }        
         return list.stream().mapToInt(i->i).toArray();
    }
}
