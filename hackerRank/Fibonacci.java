package hackerRank;

import java.io.*;
import java.util.*;

public class Fibonacci {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        
        System.out.println(fib(7));
    }
    
    public static int fib(int n){
        
        if(n==1){
            return n;
        }else if(n==2) {
        	return 1;
        }
        
        return fib(n-1)+fib(n-2);
        
    }
}
