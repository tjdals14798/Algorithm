package stu;

import java.util.Scanner;

public class pg_¸Ö¸®¶Ù±â {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dp [] = new int[2001];
		int n = sc.nextInt();
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3;i < 2001;i++) {
			dp[i] = dp[i-1]+dp[i-2] % 1234567;
		}
		
		System.out.println(dp[n]);
	}

}
