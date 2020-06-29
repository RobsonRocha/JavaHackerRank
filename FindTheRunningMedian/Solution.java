import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    static double[] runningMedian(int[] a) {
        if( a == null || a.length ==0)
            return null;

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        double[] list= new double[a.length];

        double median = 0.0;

        for(int i = 0; i < a.length; i++){
            if(a[i] <= median)
                max.add(a[i]);
            else
                min.add(a[i]);

            if(max.size() > min.size()+1)
                min.add(max.poll());
            else if(min.size() > max.size()+1)
                max.add(min.poll());

            if(min.size() == max.size())
                median = (double)(min.peek()+max.peek())/2.0;
            else if(min.size() > max.size()){
                median = min.peek();
            }
            else if(max.size() > min.size()){
                median = max.peek();
            }
            list[i] = median;

        }

        return list;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
