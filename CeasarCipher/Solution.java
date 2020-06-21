import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(String arr, int jump){
		String leters[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
				"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		Map<Integer, String> map = new HashMap<Integer, String>();
		Map<Integer, Integer> fromTo = new HashMap<Integer, Integer>();

		for(int i = 0; i < leters.length; i++){
			map.put(leters[i].codePointAt(0), leters[i]);
			//fromTo.put(leters[i].codePointAt(0)+jump,leters[i].codePointAt(0));

			if(leters[i].codePointAt(0) >= 65 && leters[i].codePointAt(0) <= 90){
				if(leters[i].codePointAt(0)+jump > 90){
					int code = (leters[i].codePointAt(0)+jump) % 91 + 65;
					while(code < 65 || code > 90)
						code = code % 91 + 65;
					fromTo.put(leters[i].codePointAt(0), code);
				}
				else
					fromTo.put(leters[i].codePointAt(0), (leters[i].codePointAt(0)+jump));
			}
			else{
				if(leters[i].codePointAt(0)+jump > 122){
					int code = (leters[i].codePointAt(0)+jump) % 123 + 97;
					while(code < 97 || code > 122)
						code = code % 123 + 97;
					fromTo.put(leters[i].codePointAt(0), code);
				}
				else
					fromTo.put(leters[i].codePointAt(0), (leters[i].codePointAt(0)+jump));
			}

		}

		String result = "";
		for(int i = 0; i < arr.length(); i++){
			String s = String.valueOf(arr.charAt(i));
			if(map.get(s.codePointAt(0)) != null){
				int code = fromTo.get(s.codePointAt(0));
				result += map.get(code);
			}
			else
				result += s;
		}

		System.out.println(result);

	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();

        printAnswer(s,k);
    }
}
