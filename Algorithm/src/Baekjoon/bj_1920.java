package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_1920 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<Integer> hs = new HashSet<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) hs.add(Integer.parseInt(st.nextToken()));
		
		n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			if(hs.contains(Integer.parseInt(st.nextToken()))) System.out.println(1);
			else System.out.println(0);
		}
		

	}

}
