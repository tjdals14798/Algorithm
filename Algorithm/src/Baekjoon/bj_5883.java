package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class bj_5883 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<>();
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			set.add(arr[i]);
		}
		
		int ans = 1;
		for(int a : set) {
			int cnt = 1;
			int idx = arr[0];
			for(int i = 1; i < n; i++) {
				if(arr[i] == a) continue;
				if(idx != arr[i]) cnt = 1;
				else {
					cnt++;
					ans = Math.max(cnt, ans);
				}
				idx = arr[i];
			}
		}
		System.out.println(ans);
	}

}
