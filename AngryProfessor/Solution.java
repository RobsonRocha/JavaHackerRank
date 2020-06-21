import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int n, int k, int arr[]){
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] <= 0){
                count++;
            }
        }
        if(count >= k)
            System.out.println("NO");
        else
            System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            printAnswer(n, k, a);
        }
    }
}
