import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(long n, long m, long s){
        if(n == m){
            System.out.println(m);
            return;
        }
        System.out.println((s+m-1)%n == 0 ? (s+m-1)%n +n : (s+m-1)%n );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();
            printAnswer(n, m, s);
        }
    }
}
