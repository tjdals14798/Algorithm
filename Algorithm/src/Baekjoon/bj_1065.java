package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1065 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()),cnt = 0;
		int arr[] = new int[3];
		
		for(int i = 1; i <= N; i++) {
			if(i < 100) cnt = i;
			else {
				String str = Integer.toString(i);
				for(int j = 0; j <arr.length; j++) {
					arr[j]=str.charAt(j)-'0';
				}
				if(arr[0]-arr[1]==arr[1]-arr[2]) cnt++;
			}
		}
		System.out.println(cnt);
	}

}
