package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1138 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			int cnt = Integer.parseInt(st.nextToken());
			for(int j = 1; j <= n; j++) {
				if(cnt == 0) {
					if(arr[j]==0) {
						arr[j] = i;
						break;
					}
					else continue;
				}else if(arr[j]==0) cnt--;
			}
		}
		for(int i = 1; i <= n; i++) System.out.print(arr[i] + " ");
	}

}
