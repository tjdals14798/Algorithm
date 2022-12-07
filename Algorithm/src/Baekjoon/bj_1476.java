package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1476 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int E = Integer.parseInt(st.nextToken()), S = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int e = 1, s = 1, m = 1, cnt = 1;
		while(true) {
			if(E==e&&S==s&&M==m) break;
			e++;s++;m++;
			if(e > 15) e = 1;
			if(s > 28) s = 1;
			if(m > 19) m = 1;
			cnt++;
		}
		System.out.println(cnt);
	}
}
