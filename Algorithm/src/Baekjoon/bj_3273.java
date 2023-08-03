package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class bj_3273 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(br.readLine());
		
		HashSet<Integer> set = new HashSet<>();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			set.add(arr[i]);
		}
		int cnt = 0;
		for(int i = 0; i < n; i++) {
			if(set.contains(x-arr[i]))cnt++;
		}
		System.out.println(cnt/2);
		
		/*		시간초과
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i]+arr[j] == x) cnt++;
			}			
		}*/
	}

}
