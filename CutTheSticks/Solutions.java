import java.io.*;
import java.util.*;

public class Solution {

    public static void sort(int inputArr[]) {
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

	private static int[] array;
    private static int[] tempMergArr;
    private static int length;


    private static void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    public static void printAnswer(int arr[]){

		int [] copy = Arrays.copyOf(arr, arr.length);
		sort(copy);

		boolean printOne = true;

		do{
			int m = copy[0];
			for(int i = 0; i < copy.length; i++)
				copy[i] -= m;
			System.out.println(copy.length);
			boolean leftOne = false;
			for(int i = 0; i < copy.length; i++)
				if(copy[i] > 0){
					copy = Arrays.copyOfRange(copy, i, copy.length);
					leftOne = true;
					break;
				}

			if(!leftOne){
				printOne = false;
				copy = Arrays.copyOfRange(copy, 0, 0);
			}

		}
		while(copy.length > 1);
		if(printOne)
			System.out.println("1");
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
             arr[arr_i] = in.nextInt();
        }
        printAnswer(arr);

    }
}
