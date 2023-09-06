package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_18310 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
				/* 집의 중앙 찾기 */
		if(n % 2 == 0) {
			System.out.println(arr[n / 2 - 1]);
		}else {
			System.out.println(arr[n / 2]);
		}
					/* 시간초과 */
//		int max = Integer.MAX_VALUE, idx = 0;
//		for(int i = 0; i < n; i++) {
//			int sum = 0;
//			
//			for(int j = 0; j < n; j++) {
//				sum += Math.abs(arr[j] - arr[i]);
//			}
//			if(max > sum) {
//				max = sum;
//				idx = arr[i];
//			}
//		}
//		System.out.println(idx);
	}

}
