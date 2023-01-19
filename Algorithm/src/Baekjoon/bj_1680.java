package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1680 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int cnt = Integer.parseInt(br.readLine());
			
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			int W = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), now_w = 0, sum_x = 0, now_x = 0;
			int x_arr[][] = new int[n][2]; 
			for(int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				x_arr[j][0] = Integer.parseInt(st.nextToken());
				x_arr[j][1] =Integer.parseInt(st.nextToken());
				
				if(now_w + x_arr[j][1] < W) {
					sum_x += x_arr[j][0]-now_x;
					now_w += x_arr[j][1];
				}else if(now_w + x_arr[j][1] == W) {
					sum_x += (x_arr[j][0] - now_x) + x_arr[j][0]*2;
					now_w = 0;
					if(j == n-1) sum_x -= x_arr[j][0]*2;
				}else if(now_w + x_arr[j][1] > W) {
					now_w = x_arr[j][1];
					sum_x += (x_arr[j][0] - now_x) + x_arr[j][0]*2;
				}
				now_x = x_arr[j][0];
				if(j == n-1) sum_x += x_arr[x_arr.length-1][0];
			}
			System.out.println(sum_x);
		}
	}

}
