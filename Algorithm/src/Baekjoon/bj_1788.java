package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1788 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		if(n > 0) System.out.println(1);
		else if(n < 0) {
			n = -n;
			if(n % 2 == 0) {
				System.out.println(-1);
			}
			else System.out.println(1);
		}else {
			System.out.println(0);
		}
		
		int arr[] = new int[1000001];
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3; i <= n; i++) arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000000;
		
		System.out.println(arr[n]);
	}

}
