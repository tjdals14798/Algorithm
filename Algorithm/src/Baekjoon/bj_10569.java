package Baekjoon;

import java.util.Scanner;

public class bj_10569 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0 ;i < n ; i++) {
			int v = sc.nextInt();
			int e = sc.nextInt();
			
			int res = v-e-2;
			System.out.println(Math.abs(res));
		}

	}

}
