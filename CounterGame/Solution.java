import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }

    // Complete the counterGame function below.
    static String counterGame(long n) {
        long count = n;
        String winner = "Richard";

        while(count > 1){

            double num = customLog(2,count);
            long integ = (long)num;

            if((num - integ) > 0 ){
                long pow = (long) Math.pow(2L, integ);
                count = count - pow;
            }
            else{
                count /=2L;
            }
            if(winner.equals("Richard"))
                winner = "Louise";
            else
                winner = "Richard";


        }

        return winner;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = counterGame(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
