package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2160 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char [][][] arr = new char[n][5][7];
		int min = Integer.MAX_VALUE, a = 0, b = 0;
		
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < 5; j++) {
				String str = br.readLine();
				for(int k = 0; k < 7; k++) {
					arr[i][j][k] = str.charAt(k);
				}
			}
		}
		
		for(int i = 0; i < n;i++) {
			for(int j = i+1; j < n;j++) {
				int cnt = 0;
				for(int k = 0; k < 5;k++) {
					for(int l = 0; l < 7; l++) {
						if(arr[i][k][l] != arr[j][k][l]) cnt++;
					}
				}
				if(min > cnt) {
					min = cnt;
					a = i+1;
					b = j+1;
				}
			}
		}
		System.out.println(a+" "+b);
	}

}
