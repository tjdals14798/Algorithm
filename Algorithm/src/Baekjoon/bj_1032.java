package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1032 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[] = new String[n];
		for(int i = 0; i < n ; i++) {
			arr[i] = br.readLine();
		}
		String res = "";
		boolean ck = false;
		for(int i = 0; i < arr[0].length(); i++) {
			
			ck = true;
			for(int j = 1; j < arr.length; j++) {
				if(arr[0].charAt(i) != arr[j].charAt(i)) {
					ck = false;
					break;
				}
			}
			if(ck) res += arr[0].charAt(i);
			else res += "?";
		}
		System.out.println(res);
	}

}
