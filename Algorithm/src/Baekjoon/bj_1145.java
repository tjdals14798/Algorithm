package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1145 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[5];
		
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < 5; i++) {
			if(min > arr[i]) min = arr[i];
		}

		while(true) {
			int cnt = 0;			
			for(int i = 0 ; i < 5; i++) {
				if(min%arr[i]==0) cnt++;
			}
			if(cnt >= 3) break;
			min++;
		}
		System.out.println(min);
	}

}
