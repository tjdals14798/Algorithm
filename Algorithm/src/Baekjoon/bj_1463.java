package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1463 {
	public static int arr[];

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		arr = new int[X+1];
		System.out.println(one(X));

//		int[] dp = new int[X+1];
//
//        dp[1] = 0;
//
//        for(int i=2; i<= X; i++) {
//            dp[i] = dp[i-1] + 1;
//            if(i % 2 == 0){
//                dp[i] = Math.min(dp[i], dp[i/2] + 1);
//            }
//            if(i % 3 == 0) {
//                dp[i] = Math.min(dp[i], dp[i/3] + 1);
//            }
//        }
//	        System.out.print(dp[X]);
//		
	}
	public static int one(int n) {
		if(n == 1) return 0;		
		if(arr[n] > 0) return arr[n];
		
		arr[n] = one(n-1)+1;
		if(n%3 == 0) arr[n] = Math.min(arr[n], one(n/3)+1);
		else if(n%2 == 0) arr[n] = Math.min(arr[n], one(n/2)+1);
		
		return arr[n];
	}

}
