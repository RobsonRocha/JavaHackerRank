import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     static Map<Character, Integer> map = new HashMap<>();
    static Map<Integer, Integer> mapValue = new HashMap<>();

    static void mapValues(String s){
        char c[] = s.toCharArray();

        int value = 0;
        char letter = c[0];
        for(int j = 0; j < c.length; j++){
            if(c[j] != letter) {
                letter = c[j];
                value =0;
            }
            value += map.get(c[j]);

            if(mapValue.get(value) == null)
                mapValue.put(value, value);

        }
    }

    // Complete the weightedUniformStrings function below.
    static String[] weightedUniformStrings(String s, int[] queries) {
        String result[] = new String[queries.length];

        for(int i = 0; i < queries.length; i++){
            if(mapValue.get(queries[i]) != null)
                result[i]="Yes";
            else
                result[i]="No";
        }

        /*char c[] = s.toCharArray();
        String result[] = new String[queries.length];

        for(int i = 0; i < queries.length; i++){
            int value = 0;
            char letter = c[0];
            for(int j = 0; j < c.length; j++){
                if(c[j] != letter) {
                    letter = c[j];
                    value =0;
                }
                value += map.get(c[j]);

                if(queries[i] == value) {
                    result[i] = "Yes";
                    break;
                }

            }
            if(result[i] == null)
                result[i]="No";
        }*/

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        for(int i = 97; i<=122; i++)
           map.put((char) i,i-96);

        String s = scanner.nextLine();
        mapValues(s);
        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
