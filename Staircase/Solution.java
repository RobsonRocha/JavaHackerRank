import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int n){
        int k = 0;
        for(int i = 0; i< n; i++){
            for(k=0; k < (n-1-i); k++)
                System.out.print(" ");
            for(k--; k < n-1; k++)
            	System.out.print("#");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printAnswer(n);
    }
}
