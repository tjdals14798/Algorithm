package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1075 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), f = Integer.parseInt(br.readLine());
		
		int tmp = (n/100) * 100;
		while(true) {
			if(tmp % f == 0) {
				int res = tmp % 100;
				if(res < 10) System.out.println("0" + res);
				else System.out.println(res);
				return;
			}
			tmp++;
		}
	}

}
