package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_11728 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(arr);
		for(int a : arr) sb.append(a).append(" ");
		System.out.println(sb);
		
	}

}
