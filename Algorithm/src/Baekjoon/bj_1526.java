package Baekjoon;

import java.util.Scanner;

public class bj_1526 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = 0;
		boolean ck = false;
		
		for(int i = 1; i <= n; i++) {
			String l = Integer.toString(i);
			for(int j = 0;j < l.length();j++) {
				if(l.charAt(j) == '7' || l.charAt(j) == '4') ck = true;
				else {
					ck = false;
					break;
				}
			}
			
			if(ck) {
				max = i;
			}
		}
		System.out.println(max);

	}

}
