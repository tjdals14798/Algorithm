package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj_1544 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		set.add(br.readLine());
		
		for(int i = 1; i < n; i++) ck(set, br.readLine());
		
		System.out.println(set.size());
	}

	private static void ck(HashSet<String> hset,String str) {
		int len = str.length();
		StringBuilder sb;
		
		for(String s : hset) {
			sb = new StringBuilder(s);
			for(int i = 0; i < len; i++) {
				if(str.equals(sb.toString())) return;
				else sb = sb.append(sb.charAt(0)).deleteCharAt(0);
			}
		}
		hset.add(str);
	}

}
