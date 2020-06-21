import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int n, int a, int b){

		int path[] = new int[n];
		path[0] = 0;
		Set<Integer> s = new TreeSet<Integer>();
		/*
		for(int i = 0; i < n; i++)
			path[i] = a*i;

		s.add(path[n-1]);

		for(int i = 0; i < n; i++)
			path[i] = b*i;

		s.add(path[n-1]);
		*/
		int t = 0;

		do{

			//for(int p = 1; p < n; p++){
				for(int i = 1; i < n; i++){
					if(/*i == p ||*/ i <= t  )
						path[i] = path[i-1]+b;
					else
						path[i] = path[i-1]+a;
				}
				s.add(path[n-1]);
			//}

			//for(int p = 1; p < n; p++){
				for(int i = 1; i < n; i++){
					if(/*i == p ||*/ i <= t )
						path[i] = path[i-1]+a;
					else
						path[i] = path[i-1]+b;
				}
				s.add(path[n-1]);
			//}

			t++;

		}
		while(t < n);


		for(Integer r : s){
			System.out.print(r +" ");
		}
		System.out.println("");

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i < t; i++){
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            printAnswer(n,a,b);
        }

    }
}
