package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class bj_1547 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cup = 1;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X =Integer.parseInt(st.nextToken()),
				Y =Integer.parseInt(st.nextToken());
			if(X == cup) {
				cup = Y;
			}else if(Y == cup){
				cup = X;
			}
		}
		
		System.out.println(cup);
	}

}