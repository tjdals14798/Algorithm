package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_16499 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		int idx = 0;
		
		for(int i = 0; i < n; i++) {
			char crr[] = br.readLine().toCharArray();
			Arrays.sort(crr);
			String str = new String(crr);
			arr[idx++] = str;
		}
		Arrays.sort(arr);
		int cnt = 1;
		for(int i = 1; i < n; i++) {
			if(!arr[i].equals(arr[i-1])) {
				cnt++;
			}
		}
		sb.append(cnt).append("\n");
		System.out.println(sb);
		
	}

}
