package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1769 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int sum, cnt = 0;
		while(str.length()!=1) {
			sum = 0;
			for(int i = 0; i < str.length(); i++) {
				sum += str.charAt(i)-'0';
			}
			str = sum+"";
			cnt++;
		}
		System.out.println(cnt);
		System.out.println(Integer.parseInt(str)%3==0?"YES":"NO");
	}

}
