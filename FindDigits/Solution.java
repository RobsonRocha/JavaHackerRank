import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int n){
		String number = String.valueOf(n);
		int count = 0;
		for(int i = 0; i < number.length(); i++){
			char c = number.charAt(i);
			int div = Integer.valueOf(String.valueOf(c));
			try{
				if(n % div == 0)
					count++;
			}
			catch(Exception e){}

		}


		System.out.println(count);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            printAnswer(n);
        }
    }
}
