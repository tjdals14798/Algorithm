package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1590 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		int res = Integer.MAX_VALUE;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken()), i = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
			while(s < t && --c > 0 && s < res) s += i;
			if(s >= t) res = Math.min(s,res);
		}
		System.out.println(res == Integer.MAX_VALUE ? -1 : res - t);
	}

}
