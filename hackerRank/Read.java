package hackerRank;

import java.io.*;
import java.util.*;

public class Read
{
    public static void main(String [] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int t = 0; t < times; t++) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            System.out.println(first+second);
        }
    }
}
