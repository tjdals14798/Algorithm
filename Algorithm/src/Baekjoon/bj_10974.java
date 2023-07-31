package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class bj_10974 {
	
	static int N;
	static int[] arr, res;
	static boolean[] ck;
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		res = new int[N];
		arr = new int[N];
		ck = new boolean[N];
		
		for(int i = 0; i < N; i++) arr[i] = i;
		
		create(0);
	
	}
	public static void create(int idx) {
		if(idx == N) {
			for(int i = 0; i < N; i++) {
				System.out.print((res[i]+1) + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(ck[i]) {
				continue;
			}
			
			res[idx] = arr[i];
			ck[i] = true;
			create(idx + 1);
			ck[i] = false;
		}
	}


}
