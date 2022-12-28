package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2578 {
	static int arr[][];
	static int cnt;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		arr = new int[5][5]; cnt = 0;
		
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) arr[i][j] = Integer.parseInt(st.nextToken());
		}
		
		int res = 0;
		for(int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				res++;
				bingo(Integer.parseInt(st.nextToken()));
				xCheck();
				yCheck();
				xyCheck();
				yxCheck();
				if(cnt >= 3) {
					System.out.println(res);
					return;
				}
				cnt = 0;
			}
		}
	}
	
	static void bingo(int n) {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[i][j] == n) arr[i][j] = 0;
			}
		}
	}
	
	static void xCheck() {
		for(int i = 0; i < 5; i++) {
			int c = 0;
			for(int j = 0; j < 5; j++) if(arr[i][j]==0) c++;
			if(c == 5) cnt++;
		}
	}
	
	static void yCheck() {
		for(int i = 0; i < 5; i++) {
			int c = 0;
			for(int j = 0; j < 5; j++) if(arr[j][i]==0) c++;
			if(c == 5) cnt++;
		}
	}
	
	static void xyCheck() {
		int c = 0;
		for(int i = 0; i < 5; i++) if(arr[i][i]==0) c++;
		if(c == 5) cnt++;
	}
	
	static void yxCheck() {
		int c = 0;
		for(int i = 0; i < 5; i++) if(arr[i][4-i]==0) c++;
		if(c == 5) cnt++;
	}

}
