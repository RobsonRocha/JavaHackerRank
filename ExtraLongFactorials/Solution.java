import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static BigInteger printAnswer(int n){
        if(n==0 || n==1){
            return new BigInteger("1");
        }

        return new BigInteger(String.valueOf(n)).multiply(printAnswer(n-1));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(printAnswer(n));
    }
}
