package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1614 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long pinger = Long.parseLong(br.readLine()), cnt = Long.parseLong(br.readLine());
		
		long idx = pinger - 1;
		if(cnt > 0) {
			if(pinger % 4 == 1) idx += 8 * cnt;
			else idx += cnt / 2 * 8 + cnt % 2 * (8 - (pinger - 1) * 2);
		}
		System.out.println(idx);
	}

}
