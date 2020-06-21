import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int x1, int r1, int x2, int r2){

		if(r2 > r1)
			System.out.println("NO");
		else{

			int i = x1;
			int j = x2;

			while(true){
				if(i == j){
					System.out.println("YES");
					break;
				}
				else if(i > j){
					System.out.println("NO");
					break;
				}
				i+=r1;
				j+=r2;
			}

		}



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        printAnswer(x1,v1,x2,v2);
    }
}
