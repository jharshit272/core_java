package programs;

import java.io.*;
import java.util.HashMap;
//import java.io.*;

 class Occurance {
	public static void main (String[] args) {
    
    String name = "test123test3";
    
    // t=2
    // e=2
    // 1=1
    // 2=1
    
    findOccurence(name);
		System.out.println("Hello Java");
	}
  
  public static void findOccurence(String name){
    
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    for(int i=0; i<name.length(); i++){
      
      if(!map.containsKey(name.charAt(i))){
        map.put(name.charAt(i), 1);
      }else{
        int value = map.get(name.charAt(i));
         map.put(name.charAt(i), value+1);
      }        
      }
      System.out.print(map);    
      
    }
}
