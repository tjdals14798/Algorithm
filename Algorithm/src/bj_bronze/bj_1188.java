package bj_bronze;

import java.util.Scanner;

public class bj_1188 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		System.out.println(M - GCD(N, M));
	}

	public static int GCD(int a, int b) {
		if(b == 0)	return a;
		return GCD(b, a%b);
	}
}