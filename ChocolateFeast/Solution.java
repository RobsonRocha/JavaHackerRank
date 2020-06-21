import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(int arr[]){

		int div = arr[0]/arr[1];
		int promo = div/arr[2];
		int rest = div % arr[2];
		int result = 0;
		if(promo > 0){
			result = div+promo;
			int promo2 = promo;
			while((rest+promo2)/arr[2] > 0){
					int promo3 = (rest+promo2)/arr[2];
					rest = (rest+promo2)%arr[2];
					promo2 = promo3;
					result += promo2;
			}
			System.out.println(result);
		}
		else
			System.out.println(div);



	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[] = new int[3];
        for(int a0 = 0; a0 < t; a0++){
            for(int arr_i = 0; arr_i < 3; arr_i++)
                arr[arr_i] = in.nextInt();

            printAnswer(arr);

        }
    }
}
