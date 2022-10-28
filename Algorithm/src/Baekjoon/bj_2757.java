package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2757 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder res = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine(),"RC");
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			
			if(R == 0 && C == 0) break;
			StringBuilder sb = new StringBuilder();
			while(C --> 0) {
				sb.append((char)('A'+C%26));
				C/=26;
			}
			res.append(sb.reverse().append(R).append("\n"));
		}
		System.out.println(res);

	}

}
