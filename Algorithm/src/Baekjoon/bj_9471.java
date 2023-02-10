package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9471 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int cnt = 0; cnt < n; cnt++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int fibo1 = 1, fibo2 = 1, c = 0;
			while(true) {
				int fibo = (fibo1+fibo2) % b;
				fibo1 = fibo2;
				fibo2 = fibo;
				c++;
				if(fibo1 == 1 && fibo2 == 1) break; 
			}
			sb.append(a).append(" ").append(c).append("\n");
		}
		System.out.println(sb);
	}

}
