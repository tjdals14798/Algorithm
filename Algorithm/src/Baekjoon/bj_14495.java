package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_14495 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] fibo = new long[117];
		fibo[1] = fibo[2] = fibo[3] = 1;
        for (int i = 4; i <= n; i++) {
        	fibo[i] = fibo[i-1] + fibo[i-3];
        }
        System.out.print(fibo[n]);
//		System.out.println(fibo(n));
	}
	// 시간초과
//	public static int fibo(int n) {
//		if(n <= 3) return 1;
//		else return fibo(n-1) + fibo(n-3);
//	}

}
