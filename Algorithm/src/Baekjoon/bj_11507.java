package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj_11507 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		HashSet<String> hs = new HashSet<>();
        int[] cnt = new int[4];
        for (int i = 0; i < str.length(); i+=3) {
            String cur = str.substring(i, i+3);
            if (hs.contains(cur)) {
                System.out.println("GRESKA");
                return;
            }
            hs.add(cur);

            switch (cur.charAt(0)) {
                case 'P' : cnt[0]++; break;
                case 'K' : cnt[1]++; break;
                case 'H' : cnt[2]++; break;
                case 'T' : cnt[3]++; break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(13-cnt[i]).append(' ');
        }
        System.out.println(sb);
    }
}		
		/*
		 * String arr[] = new String[4]; int p=13,k=13,h=13,t=13; String str =
		 * br.readLine();
		 * 
		 * for(int i = 0; i < arr.length; i+=3) { arr[i] = str.substring(i, i+3); }
		 * 
		 * boolean ck = true; for(int i = 0; i < arr.length; i++) { if(!ck) break;
		 * for(int j = i+1; j < arr.length; j++) { if(arr[i].equals(arr[j])) { ck =
		 * false; } } }
		 * 
		 * for(int i = 0; i < arr.length; i++) { if(arr[i].charAt(0)=='P') p--; else
		 * if(arr[i].charAt(0)=='K') k--; else if(arr[i].charAt(0)=='H') h--; else t--;
		 * } if(ck) System.out.println(p+" "+k+" "+h+" "+t); else
		 * System.out.println("GRESKA");
		 */		


