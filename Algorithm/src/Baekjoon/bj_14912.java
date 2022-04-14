package Baekjoon;

import java.util.Scanner;

public class bj_14912 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt() ,cnt = 0;
		char N = sc.next().charAt(0);
		
		for(int i = 1;i <= T;i++) {
			String str = Integer.toString(i);
			for(int j = 0;j < str.length();j++) {
				if(str.charAt(j)==N)cnt++;
			}		
		}
		
		System.out.println(cnt);
	}

}
