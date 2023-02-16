package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1459 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken());
		int w = Integer.parseInt(st.nextToken()), s = Integer.parseInt(st.nextToken());
		// 일자로만 이동
		long res1 = (x + y) * w;
		long res2;
		// 홀짝으로 이동
		if((x + y) % 2 == 0) res2 = Math.max(x, y) * s; //	/\// 대각선으로만 이동
		else res2 = (Math.max(x, y) - 1) * s + w;		//	/\/- (대각 - 1) + 일자로 이동 
		// 대각선 + 일자로 이동
		long res3 = (Math.min(x, y) * s) + Math.abs(x - y) * w;
		
		System.out.println(Math.min(Math.min(res1, res2), res3));
	}

}
