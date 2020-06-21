import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static class Couple{
        private int right;
        private int left;

        public Couple(){
            this.right = 0;
            this.left = 1;
        }

        public int getRight() {
            return this.right;
        }

        public int getLeft(){
            return this.left;
        }

        public void setRight(int right) {
            this.right = right;
        }

        public void setLeft(int left) {
            this.left = left;
        }
    }

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        if(p>n)
            return 0;

        Couple couple = new Couple();
        int forward = 0;
        int backward = 0;

        for(int i=0;i<n; i++){
            if(p == couple.getRight() || p==couple.getLeft()){
                forward = i;
                break;
            }
            else{
                couple.setRight(couple.getRight()+2);
                couple.setLeft(couple.getLeft()+2);
            }
        }

        if(n % 2 == 0){
            couple.setRight(n);
            couple.setLeft(n+1);
        }
        else{
            couple.setRight(n-1);
            couple.setLeft(n);
        }

        int j = 0;
        for(int i=n;i>=0; i--){
            if(p == couple.getRight() || p==couple.getLeft()){
                backward = j;
                break;
            }
            else{
                couple.setRight(couple.getRight()-2);
                couple.setLeft(couple.getLeft()-2);
                j++;
            }
        }

        return forward < backward ? forward : backward;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
