package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1748 {

	public static void main(String[] args)throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0, len = 1, num = 10;
		
		for(int i = 1; i <= n; i++) {
			if(i % num == 0) {
				len++;
				num *= 10;
			}
			cnt += len;
		}
		System.out.println(cnt);
	}

}
