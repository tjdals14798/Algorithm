package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1246 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int arr[] = new int[M];

		for(int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());		
		}
		
		Arrays.sort(arr);
		int max = 0, res = 0, p = 0;
		for(int i = 0; i < M; i++) {
			if(M - i < N) res = arr[i] * (M-i);	//8	21 16 10	
			else res = arr[i] * N;
			
			if(max < res) {
				p = arr[i];
				max = res;
			}
		}
		System.out.println(p+" "+max);
	}

}
