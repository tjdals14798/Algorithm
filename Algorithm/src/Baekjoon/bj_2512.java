package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2512 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int left = 0, right = -1;
		int arr[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, arr[i]);
		}
		int sum = Integer.parseInt(br.readLine());
		
		while(left <= right) {
			int mid = (left + right) / 2;
			long res = 0;
			
			for(int i = 0; i < N; i++) {
				if(arr[i] > mid) res += mid;
				else res += arr[i];
			}
			if(res <= sum) left = mid + 1;
			else right = mid - 1;
		}
		System.out.println(right);
	}

}
