import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int n, int arr[]){

        double positive = 0L;
        double negative = 0L;
        double zero = 0L;

        for(int i = 0; i < n ; i++){
            if(arr[i] == 0)
                zero++;
            else if(arr[i] < 0)
                negative++;
            else
                positive++;
        }
        System.out.println((double)(positive/(double)n));
        System.out.println((double)(negative/(double)n));
        System.out.println((double)(zero/(double)n));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        printAnswer(n,arr);
    }

}
