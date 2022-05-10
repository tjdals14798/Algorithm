package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_17205 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		
		long cnt = 0;
		
		for(int i = 0;i < arr.length;i++) {
			if(i == T-1) {
				cnt += arr[i] - 'a'+1;
				break;
			}
			
			long c = 26;
			for(int j = i+2;j < T;j++) c = c*26+26;
			
			cnt += (arr[i]-'a') * c + (arr[i]-'a'+1);
		}
		System.out.println(cnt);

	}

}
