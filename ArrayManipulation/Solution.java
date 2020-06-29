import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static long maxLong(long i, long j){

        if(i <= j)
            return j;

        return i;

    }

    static long maxArray(long []a){
        int i = 0;
        long max = 0;

        do{
            max=maxLong(max,a[i++]);
        }
        while(i < a.length);

        return max;
    }

    static boolean between(int n, int ini, int end){

        return(n >= ini && n <= end);

    }
    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int l, int[][] queries) {

        long arr[] = new long[n];

        for(int i=0;i<l;i++){
            int lower=queries[i][0];
            int  upper=queries[i][1];
            int sum=queries[i][2];
            arr[lower-1]+=sum;
            if(upper<n) arr[upper]-=sum;
        }

        for (int j = 1; j < n; j++) {
            arr[j] += arr[j-1];
        }

        return maxArray(arr);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, m, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
