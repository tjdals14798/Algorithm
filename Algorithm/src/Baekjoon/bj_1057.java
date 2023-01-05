package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1057 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), g = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), cnt = 0;
		
		while(g != h) {
			g = g/2 + g%2;
			h = h/2 + h%2;
			cnt++;
		}
		System.out.println(cnt);
	}

}
