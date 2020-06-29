import java.io.*;
import java.util.*;

public class Solution {

    private static Stack<Integer> stack = new Stack<Integer>();
    private static TreeSet<Integer> maximum = new TreeSet<>();

    private static void solution(int instruction, int value){

        try {
            switch (instruction) {
                case 1:
                    stack.push(value);
                    maximum.add(value);
                    break;
                case 2:
                    int p = stack.pop();
                    if(!stack.contains(p))
                        maximum.remove(p);
                    break;
                case 3:
                    if(!maximum.isEmpty()){
                        System.out.println(maximum.last());
                    }
            }
        }
        catch(Exception e){}

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = Integer.valueOf(scan.nextLine());


        for (int i = 0; i < t; i++) {

            String line[] = scan.nextLine().split(" ");

            if(line.length > 1)
                solution(Integer.valueOf(line[0]), Integer.valueOf(line[1]));
            else if(!line[0].isEmpty())
                solution(Integer.valueOf(line[0]), 0);
        }
        scan.close();


    }
}
