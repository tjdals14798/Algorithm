package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_26069 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()),idx = 0;;
		StringTokenizer st;
		boolean ck = true;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals("ChongChong")||st.nextToken().equals("ChongChong")) {
				ck = true;
				idx = i;
				break;
			}
			else ck = false;
		}
		if(ck)System.out.println(n-idx+1);
		else System.out.println(1);
	}

}
