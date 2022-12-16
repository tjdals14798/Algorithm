package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2847 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

		int max = arr[N-1], cnt = 0;
		for(int i = N-2; i >= 0; i--) {
			if(arr[i]>=max) {
				cnt++;
				while(--arr[i]>=max) cnt++;
			}
			max = arr[i];
		}	
		System.out.println(cnt);
	}

}
