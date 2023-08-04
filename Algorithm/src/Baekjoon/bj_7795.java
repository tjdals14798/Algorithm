package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_7795 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a[],b[];
		int T = Integer.parseInt(br.readLine());
		
		for(int cnt = 0; cnt < T; cnt++) {
			st = new StringTokenizer(br.readLine());
			a = new int[Integer.parseInt(st.nextToken())];
			b = new int[Integer.parseInt(st.nextToken())];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < a.length; i++) a[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < b.length; i++) {
				b[i] = Integer.parseInt(st.nextToken());
				min = Math.min(min, b[i]);
			}
			Arrays.sort(b);
			int res = 0;
			for(int i = 0; i < a.length; i++) {
				if(a[i] <= min) continue;
				for(int j = 0; j < b.length; j++) {
					if(a[i] <= b[j]) {
						break;
					}else {
						res++;						
					}
				}
			}
			System.out.println(res);
			
		}
	}

}
