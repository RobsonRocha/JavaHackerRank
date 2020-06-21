import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(String []arr){

		if(arr.length >= 3){
			for(int i = 1; i < arr.length-1; i++){
				for(int j=1 ; j < arr[i].length()-1; j++){
					//if((j+1) <= (arr[i].length()-1) && arr[i].charAt(j) > arr[i].charAt(j+1))
						//greatest = j;
				//}
					if((j+1) <= (arr[i].length()-1) && arr[i-1].charAt(j) < arr[i].charAt(j) && arr[i+1].charAt(j) < arr[i].charAt(j)
							&& arr[i].charAt(j-1) < arr[i].charAt(j) && arr[i].charAt(j+1) < arr[i].charAt(j)){
						char aux[] = arr[i].toCharArray();
						aux[j] = 'X';
						arr[i] = "";
						for(int k = 0; k < aux.length; k++ )
							arr[i] += aux[k];
					}
				}
			}

		}

		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        printAnswer(grid);
    }
}
