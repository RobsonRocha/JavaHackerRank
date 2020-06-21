import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gemstones function below.
    static int gemstones(String[] arr) {
        int count = 0;
        char c[] = arr[0].toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < c.length; i++ ){
            boolean all = true;

            for(int j = 1 ; j < arr.length; j++){
                if(arr[j].indexOf(c[i]) < 0 ){
                    all = false;
                    break;
                }
            }

            if(all && map.get(c[i]) == null){
                count++;
            }

            map.put(c[i], 1);

        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
