package amaz;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class DateSort implements Comparator<List<String>>{

	@Override
	public int compare(List<String> o1, List<String> o2) {

		if(o1.get(0).split("-")[0].compareTo(o2.get(0).split("-")[0]) == 0) {
			if(o1.get(0).split("-")[1].compareTo(o2.get(0).split("-")[1]) == 0) {
				return o1.get(0).split("-")[2].compareTo(o2.get(0).split("-")[2]);
			}else {
				return o1.get(0).split("-")[1].compareTo(o2.get(0).split("-")[1]);
			}

		}else {

			return o1.get(0).split("-")[0].compareTo(o2.get(0).split("-")[0]) ;
		}

	}   
}
class Result {

	/*
	 * Complete the 'mergeRange' function below.
	 *
	 * The function is expected to return a 2D_STRING_ARRAY.
	 * The function accepts 2D_STRING_ARRAY dateList as parameter.
	 */

	public static List<List<String>> mergeRange(List<List<String>> dateList) {

		Collections.sort(dateList, new DateSort());
		
		Iterator<List<String>> dateListItr = dateList.iterator();
		
		
		while(dateListItr.hasNext()) {

			List<String> endDate = dateListItr.next();
			if(compare(endDate.get(1), dateListItr.next().get(0))>0) {
				dateListItr.remove();
			}
		}


//		for (int i = 0; i < dateList.size()-1; i++) {
//
//			if(compare(dateList.get(i).get(1), dateList.get(i+1).get(0))>0) {
//				dateList.remove(i+1);
//			}
//		}

		List<String> loans = new ArrayList<>();
		loans.add("personal loan"); 
		loans.add("home loan"); 
		loans.add("auto loan"); 
		loans.add("credit line loan"); 
		loans.add("mortgage loan"); 
		loans.add("gold loan"); 
		Collections.sort(loans);
		// printing ArrayList before removing any element System.out.println(loans);
		// removing element using ArrayList's remove method during iteration 
		// This will throw ConcurrentModification
		for (String loan : loans) { 
			if (loan.equals("personal loan")) { 
				loans.remove(loan); 
			} 
		} // printing ArrayList after removing an element
		System.out.println(loans); 


	System.out.println(dateList);
	return null;

}


public static int compare(String s1, String s2) {

	if(s1.split("-")[0].compareTo(s2.split("-")[0]) == 0) {
		if(s1.split("-")[1].compareTo(s2.split("-")[1]) == 0) {
			return s1.split("-")[2].compareTo(s2.split("-")[2]);
		}else {
			return s1.split("-")[1].compareTo(s2.split("-")[1]);
		}

	}else {

		return s1.split("-")[0].compareTo(s2.split("-")[0]) ;
	}

}


//	public static boolean compare(String s1, String s2) {
//
//		if(s1 == s2) {
//			return true;
//		}
//		if(s1.split("-")[0].compareTo(s2.split("-")[0])>0) {
//			return true;
//		}else {
//			return false;
//		}
//	}

}

public class Solution{
	public static void main(String[] args) {
		List<List<String>> dateList = new ArrayList<List<String>>();
		List<String> date = new ArrayList<String>();

		date.add("2014-06-05");
		date.add("2018-03-03");
		dateList.add(date);
		date = new ArrayList<String>();

		date.add("2018-06-05");
		date.add("2018-07-07");
		dateList.add(date);
		date = new ArrayList<String>();


		date.add("2018-06-05");
		date.add("2018-07-07");
		dateList.add(date);
		date = new ArrayList<String>();;

		date.add("2012-02-23");
		date.add("2013-04-05");
		dateList.add(date);
		date = new ArrayList<String>();


		date.add("2013-03-04");
		date.add( "2014-01-01");
		dateList.add(date);
		date = new ArrayList<String>();;




		System.out.println(dateList);
		Result.mergeRange(dateList);
	}
}
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int dateListRows = Integer.parseInt(bufferedReader.readLine().trim());
//        int dateListColumns = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<List<String>> dateList = new ArrayList<>();
//
//        IntStream.range(0, dateListRows).forEach(i -> {
//            try {
//                dateList.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split("-"))
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
//
//        List<List<String>> result = Result.mergeRange(dateList);
//
//        result.stream()
//            .map(
//                r -> r.stream()
//                    .collect(joining(" "))
//            )
//            .map(r -> r + "\n")
//            .collect(toList())
//            .forEach(e -> {
//                try {
//                    bufferedWriter.write(e);
//                } catch (IOException ex) {
//                    throw new RuntimeException(ex);
//                }
//            });
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
