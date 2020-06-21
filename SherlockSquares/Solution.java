import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int arr[]){
		int count = 0;
		long sqrt = (long) Math.ceil(Math.sqrt(arr[0]));
		long pow;

		for(long i = 0; i < arr[1]; i++){
			pow = (long) Math.pow(sqrt+i,2);
			if(arr[0] <= pow && pow <= arr[1])
				count++;
			else
				break;
		}

		System.out.println(count);

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[2];
        for(int i = 0; i < n; i++){
            for(int arr_i=0; arr_i < 2; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            printAnswer(arr);
        }
    }
}
