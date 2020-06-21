import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int n){

		if(n < 3 || n ==4){
			System.out.println("-1");
			return;
		}

		if(n % 5 == 0 && n % 3 ==0){
			for(int i = 0; i<n; i++)
				System.out.print("5");
            System.out.println("");
			return;
		}		

		if(n % 3 == 0){
			for(int i = 0; i<n; i++)
				System.out.print("5");
            System.out.println("");
			return;
		}

		int rest5 = n-5;
		while(rest5 % 3 != 0)
			rest5 -= 5;

		int rest3 = n - rest5;

        if(rest5 < 0 ){
			System.out.println("-1");
			return;
		}

		if(rest5+rest3 != n){
			System.out.println("-1");
			return;
		}

		for(int i = 0; i < rest5; i++)
			System.out.print("5");

		for(int i = 0; i < rest3; i++)
			System.out.print("3");

        System.out.println("");

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
