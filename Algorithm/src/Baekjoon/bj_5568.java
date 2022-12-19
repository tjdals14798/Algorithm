package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class bj_5568 {
	public static int n,k;
	public static boolean[] ck;
	public static int[] arr;
	public static Set<String> set = new HashSet<>();
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		ck = new boolean[n];
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		
		chNum(0, "");
		System.out.println(set.size());
	}
	
	public static void chNum(int i, String num) {
		if(i == k) {
			set.add(num);
			return;
		}
		
		for(int j = 0; j < n; j++) {
			if(!ck[j]) {
				ck[j] = true;
				chNum(i+1,num+arr[j]);
				ck[j] = false;
			}
		}
	}

}
