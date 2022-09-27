package Baekjoon;

import java.util.Scanner;

public class bj_23806 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = n*5;
		
		for(int j = 0;j < n; j++) {
			for(int i = 0;i<max;i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for(int j = 0;j < max-(n*2); j++) {
			for(int i = 0;i<n;i++) {
				System.out.print("@");
			}
			for(int i = 0;i<max-(n*2);i++) {
				System.out.print(" ");
			}
			for(int i = 0;i<n;i++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for(int j = 0;j < n; j++) {
			for(int i = 0;i<max;i++) {
				System.out.print("@");
			}
			System.out.println();
		}

	}

}
