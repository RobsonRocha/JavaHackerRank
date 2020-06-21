import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int d1,int m1, int y1, int d2, int m2, int y2){
		if(y1 > y2){
			System.out.println(10000);
			return;
		}
		else if(y1 == y2){
            if(m1 > m2){
                if(m1 - m2 > 1){
                    System.out.println(500*(m1-m2));
                    return;
                }
                System.out.println(15*(d1-d2+30));
                return;
            }
            else if(m1 == m2){
                if(d1 > d2){
                    System.out.println(15*(d1-d2));
                    return;
                }
            }
        }

		System.out.println(0);
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();

        printAnswer(d1,m1,y1,d2,m2,y2);
    }
}
