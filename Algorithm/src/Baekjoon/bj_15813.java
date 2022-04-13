package Baekjoon;

import java.util.Scanner;

public class bj_15813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	String name = sc.next();	int res=0;
		for(int i=0;i<N;i++) {
			res+=name.charAt(i)-64;
		}
		System.out.println(res);
	}

}
