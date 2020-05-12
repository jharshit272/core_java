package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringTest {

	public static void main(String[] args) {
		
		
		ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "f"));
        
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));
         
        Collections.sort(listOne);
        Collections.sort(listTwo);
         
        //Compare unequal lists example
         
        boolean isEqual = listOne.equals(listTwo);      //false
        System.out.println(isEqual);
         
        //Compare equals lists example
         
        ArrayList<String> listThree = new ArrayList<>(Arrays.asList("b", "c", "d", "f","a"));
         
        isEqual = listOne.equals(listThree);      //true
        System.out.println(isEqual);
		
	}
}
