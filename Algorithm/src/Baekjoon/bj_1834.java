package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1834 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());

		long ans = (num - 1) * (num + 1 + (num + 1) * (num - 1)) / 2;

		System.out.println(ans);

	}

}
