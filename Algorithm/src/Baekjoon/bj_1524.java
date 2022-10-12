package Baekjoon;

import java.util.Scanner;

public class bj_1524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0;i < T;i++) {
			int s = sc.nextInt(), b = sc.nextInt();			
			int smax = 0, bmax=0;
			
			for(int j = 0;j < s;j++) {
				int ss = sc.nextInt();
				if(ss>smax) smax = ss;
			}
			for(int j = 0;j < b;j++) {
				int bs = sc.nextInt();
				if(bs>bmax) bmax = bs;
			}
			
			if(smax>=bmax) System.out.println("S");
			else if(smax<bmax) System.out.println("B");
			else System.out.println("C");
		}

	}

}
