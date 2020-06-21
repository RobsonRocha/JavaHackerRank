import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void printAnswer(String[]G, String R[]){

		Map<Integer, String> map = new HashMap<Integer, String>();
		boolean found = false;
		for(int i = 0; i<G.length; i++){
			if(G[i].contains(R[0])){
				int index = -1;
				int pos = 0;
				do{
					 index = G[i].indexOf(R[0], pos);
					 if(index >= 0)
						 map.put(index, R[0]);
					 pos = index+1;
				}
				while(index >= 0);

				for(int j = 1; j < R.length; j++){
					found = false;
					if(G[i+j].contains(R[j])){
						pos = 0;
						do{
							index = G[i+j].indexOf(R[j], pos);
							if(map.get(index)==null){
								found = false;
								break;
							}
							else{
								found = true;
								break;
							}
						}
						while(index >= 0);
					}
					else
						break;
				}
				if(found){
					System.out.println("YES");
					return;
				}

			}
		}

		if(!found)
			System.out.println("NO");
		else
			System.out.println("YES");


	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            printAnswer(G,P);
        }

    }
}
