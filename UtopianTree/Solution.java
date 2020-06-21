import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int n){
		int result = 1;
		int count = n;
		do{
			count--;
			if(count >= 0)
				result *=2;
			count--;
			if(count >= 0)
				result +=1;
		}
		while(count >= 0);

		System.out.println(result);
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
