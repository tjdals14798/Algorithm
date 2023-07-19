package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10610 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int arr[] = new int[10];
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int n = str.charAt(i)-48;
			arr[n]++;
			sum+=n;
		}
		
		if(!str.contains("0") || sum % 3 != 0) {
			System.out.println("-1");
			return;
		}
		
		for(int i = 9; i >= 0; i--) {
			while(arr[i] != 0) {
				sb.append(i);
				arr[i]--;
			}
		}
		
		System.out.println(sb);
		
	}

}
