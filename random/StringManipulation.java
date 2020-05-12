//package random;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//
//public class StringManipulation {
//
//
//	// convert the string to only numbers
//
//	public static void main(String[] args) {
//	//	random();	
//		
//		String string = "aabbbccccaaa";
//		manipulate(string);
//		
//		String users = " User1,User2,User1,User3,User1,User2,User2,User1";
//	//		findCount(users);
//		
//		
//	}
//
//	private static void findCount(String users) {
//		String[] user = users.split(",");
//		HashMap<String, Integer> userLoginCount = new HashMap<String, Integer>();
//		int n = user.length; 	
//
//		for(int i = 0; i < n; i++){
//			if(userLoginCount.containsKey(user[i])){
//				int value = userLoginCount.get(user[i])+1;
//				userLoginCount.replace(user[i], value);
//			}else{
//				userLoginCount.put(user[i], 1);
//			}
//		}
//		System.out.println(userLoginCount);
//	}
//
//	private static void manipulate(String string) {
//	
//		StringBuffer sb = new StringBuffer();
//		int num = 1;
//		for(int i=0; i<string.toCharArray().length-1; i++){
//			if(string.charAt(i)==string.charAt(i+1)){
//				num++;
//			}else{
//				
//				sb.append(string.charAt(i));
//				sb.append(num);
//				num=1;
//			}
//			
//			if(i+1==string.toCharArray().length-1){
//				sb.append(string.charAt(i));
//				sb.append(num);
//				num=1;
//			}
//		}
//		System.out.println(sb);
//		
//	}
//
//	private static void random() {
//		String sample = "amz 20+15, lyft 7.3, late fee 27, kitch 4, amz 13+19, lyft 7.6, lyft 6.3, amz 18.4+8";
//		
//		//	System.out.println(sample.replaceAll("\\D", " + "));
//		//	System.out.println(sample.replaceAll("[\\D.-]", " + ").replaceAll("[++]", ""));
//			ArrayList<String> newArray = new ArrayList<String> (Arrays.asList(sample.split("[^\\d.-]")));
//			System.out.println(newArray.removeAll(Arrays.asList("")));
//			System.out.println(newArray.toString().replaceAll(", ", "+" ));		
//		
//	}
//	
//	
//	/*
//	Given a list of strings, group strings which are anagrams of each other
//	e.g.
//	Input: [“cat”, “tea”, “apple”, “ate”, “tac”, “act”]
//	Output: [[“cat", "tac", ”act”], [“tea", “ate”], [”apple”]]
//	*/
//
//	//all unique string
//	// all are anagrams
//	// empty input
//	//input is very big sized arrray
//	// elements are substring of each other
//	//numbers, specialString
//	//elements are big sized string, null character/ single character
//	// String = "abc/n%d"  == regular Expression  == for breaking the code
//
//	public static void main(String[] args){
//	    
//	    String[] input = new String[] [“cat”, “tea”, “apple”, “ate”, “tac”, “act”];
//	    //String[][] output = new String
//	    HashMap<String, List<String>> output = new HashMap<String, List<String>>();
//	    
//	    for(int i=0; i<input.length; i++){
//	       // i = 0, 
//	       char[] inputElement = Arrays.toCharArray(input[i]);
//	      
//	       Collections.sort(inputElement);  //inputElement =  [a,c,t] = act
//	      
//	      if(output.containsKey(inputElement.toString())){
//	         List<String> stringList = output.get(inputElement.toString);   // {eat}
//	          stringList.add(input[i]);      // {eat, ate}
//	          
//	      }
//	      else{
//	          List<String> stringList = new ArrayList<String>
//	          output.put(inputElement.toString, stringList);     // outmap  ==     {act, {cat, tac, act} }
//	                                                                            // {aet, {eat, ate}
//	                                                                             //{aelpp, {apple}}
//	          stringList.add(input[i]);
//	      }
//	    }
//	    
//	   
//	}
//
//}
