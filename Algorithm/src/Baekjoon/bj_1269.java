package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_1269 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), cnt = 0;
		HashSet<Integer> set = new HashSet<>(); 
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < a; i++) set.add(Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < b; i++) {
			int n = Integer.parseInt(st.nextToken());
			if(set.contains(n)) cnt++;
			else set.add(n);
		}
		
		System.out.println(a+b-2*cnt);
		
	}
}