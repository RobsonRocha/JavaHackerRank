import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printSum(int length, int [] arr){

        long sum = 0L;

        for(int i = 0; i < length; i++)
            sum += (long)arr[i];

        System.out.println(sum);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        printSum(n, arr);
    }
}
