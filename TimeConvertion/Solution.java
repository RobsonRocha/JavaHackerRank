import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(String time){
        String hours;
		String minutes;
		String seconds;

		String split[] = time.split(":");

		hours = split[0];
		minutes = split[1];
		seconds = split[2];

		if(seconds.contains("PM")){
			int h = Integer.valueOf(hours);
			if(h != 12){
				h += 12;
				h %= 24;
			}
			System.out.println(String.format("%02d", h)+":"+minutes+":"+seconds.substring(0, 2));
		}
		else{
			int h = Integer.valueOf(hours);
			if(h == 12){
				h += 12;
				h %= 24;
			}
			System.out.println(String.format("%02d", h)+":"+minutes+":"+seconds.substring(0, 2));
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        printAnswer(time);
    }
}
