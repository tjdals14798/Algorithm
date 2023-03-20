package Baekjoon;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class bj_1297 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int D = Integer.parseInt(st.nextToken()),
			H = Integer.parseInt(st.nextToken()),
			W = Integer.parseInt(st.nextToken());
		
		double res = Math.sqrt(Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W, 2)));
		sb.append((int)Math.floor(res*H)).append(" ").append((int)Math.floor(res*W));
		
		System.out.println(sb);
	}

}
