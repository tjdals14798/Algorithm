package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1543 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), ans = br.readLine();
		int cnt = 0;
		str = str.replaceAll(ans,"0");
		
		for(int i = 0; i < str.length(); i++) if(str.charAt(i)=='0')cnt++;
		System.out.println(cnt);
		
	}

}
