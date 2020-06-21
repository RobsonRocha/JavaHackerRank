import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the flippingBits function below.
    static String decimal2Binary(long n){
        String result = "";
        for(int i = 31; i >=0; i--){
            long num = n >> i;
            if((num & 1) >0){
                result += "1";
            }
            else
                result += "0";
        }

        return result;

    }

    static long binary2Decimal(String s){
        String num = s;
        long dec_value = 0;

        // Initializing base value to 1,
        // i.e 2^0
        long base = 1;

        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }

        return dec_value;
    }

    static long flippingBits(long n) {
        String bin = decimal2Binary(n);
        bin = bin.replaceAll("1","2");
        bin = bin.replaceAll("0","1");
        bin = bin.replaceAll("2", "0");

        return binary2Decimal(bin);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            long n = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            long result = flippingBits(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
