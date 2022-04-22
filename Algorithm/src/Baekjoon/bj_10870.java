package Baekjoon;

import java.util.Scanner;

public class bj_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println(fibonacci(t));

	}
	
	static int fibonacci(int O) {
		if(O==0) return 0;
		if(O==1) return 1;
		return fibonacci(O-1)+fibonacci(O-2);
	}

}
