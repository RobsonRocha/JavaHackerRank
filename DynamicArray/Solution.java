import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the dynamicArray function below.
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        int lastAnswer = 0;
        Map<Integer, List<Integer>> seq = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        for(List<Integer> query : queries){
            System.out.println(query.toString());
            int q = query.get(0);

            if(q == 1){

              int key = (query.get(1) ^ lastAnswer)% n;

              List<Integer>list = seq.get(key);

              if(list == null){
                  list = new ArrayList<>();
              }

              list.add(query.get(2));
              seq.put(key, list);
            }

            if (q == 2) {
                int key = (query.get(1) ^ lastAnswer)% n;
                System.out.println("Chave "+key);

                List<Integer> last = seq.get(key);

                lastAnswer = last.get(query.get(2)%last.size());
                result.add(lastAnswer);
                System.out.println("Last Answer "+lastAnswer);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nq[0]);

        int q = Integer.parseInt(nq[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = dynamicArray(n, queries);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
