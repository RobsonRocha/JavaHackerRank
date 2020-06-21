import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int div, int r1[]){
		int count = 0;
		for(int i = 0; i < r1.length; i++){
			for(int j = i+1; j < r1.length; j++)
				if((r1[i]+r1[j])%div == 0)
					count++;
		}

		System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        printAnswer(k,a);
    }
}
