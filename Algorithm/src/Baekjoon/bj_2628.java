package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2628 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int wid = Integer.parseInt(st.nextToken());
		int hei = Integer.parseInt(st.nextToken());
		
		boolean widArr[] = new boolean[wid];
		boolean heiArr[] = new boolean[hei];
		
		int n = Integer.parseInt(br.readLine());
		
		while(n > 0) {
			st = new StringTokenizer(br.readLine());
			int xy = Integer.parseInt(st.nextToken()), idx = Integer.parseInt(st.nextToken());
			
			if(xy == 0) heiArr[idx] = true;
			else widArr[idx] = true;
			n--;
		}
		
		int max_wid = 0, tmp = 0;
		for (int i = 0; i < widArr.length; i++) {
			if (widArr[i]) {
				max_wid = Math.max(max_wid, tmp);
				tmp = 1;
			} else
				tmp++;
		}
		max_wid = Math.max(max_wid, tmp);
		
		tmp = 0;
		int max_hei = 0;
		for (int i = 0; i < heiArr.length; i++) {
			if (heiArr[i]) {
				max_hei = Math.max(max_hei, tmp);
				tmp = 1;
			} else
				tmp++;
		}
		max_hei = Math.max(max_hei, tmp);

		System.out.println(max_wid * max_hei);
	}

}
