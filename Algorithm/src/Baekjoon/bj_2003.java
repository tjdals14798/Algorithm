package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2003 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()),cnt = 0;
		st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			int sum = arr[i];
			if(sum == M) {
				cnt++;
				continue;
			}
			for(int j = i+1; j < N; j++) {
				sum += arr[j];
				if(sum == M) {
					cnt++;
					break;
				}
				 
			}
		}
		System.out.println(cnt);
		
//		int count = 0, left = 0, right = 0, sum = 0; 
//      while (end <= N){	end가 배열 범위를 초과하면 break;
//          if(sum >= m) sum -= arr[left++];	구간합이 목표값 보다 크거나 같으면
//          else if(sum < M) sum += arr[right++];	구간합이 목표값 보다 작으면 
//
//          if(sum == m) count++;
//        }
	}

}
