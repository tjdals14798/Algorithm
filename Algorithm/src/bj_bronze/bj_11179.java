package bj_bronze;

import java.util.Scanner;

public class bj_11179 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String N = Integer.toBinaryString(sc.nextInt());
		
		StringBuffer sb = new StringBuffer(N);
		N = sb.reverse().toString();
		int M = Integer.parseInt(N,2);
		System.out.println(M);
	}

}
