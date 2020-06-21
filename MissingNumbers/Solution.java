import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the missingNumbers function below.
    static Integer[] missingNumbers(int[] arr, int[] brr) {
        HashMap<Integer, Integer> mapA = new HashMap<>();
        HashMap<Integer, Integer> mapB = new HashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i < brr.length; i++){
            if(i < arr.length){
                Integer value = mapA.get(arr[i]);
                if(value != null){
                    mapA.put(arr[i],++value);
                }
                else
                    mapA.put(arr[i],1);
            }

            Integer value = mapB.get(brr[i]);
            if(value != null){
                mapB.put(brr[i],++value);
            }
            else
                mapB.put(brr[i],1);
        }

        mapA.keySet().forEach(k -> {
            if(mapB.get(k) != null && !mapA.get(k).equals(mapB.get(k)))
                answer.add(k);
        });

        mapB.keySet().forEach(k -> {
            if(mapA.get(k) == null)
                answer.add(k);
        });

        Integer[] result = new Integer[answer.size()];

        answer.toArray(result);

        Arrays.sort(result);

        return result;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        Integer[] result = missingNumbers(arr, brr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
