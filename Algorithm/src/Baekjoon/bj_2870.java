package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class bj_2870 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Long> arr = new ArrayList<>();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine().replaceAll("[^0-9]", " "));
			for(int j = 0; j <= st.countTokens(); j++) {
				arr.add(Long.parseLong(st.nextToken()));
			}
		}
		Collections.sort(arr);
		for(Long i : arr) sb.append(i).append("\n");
		System.out.println(sb);
		
	}

}
