package Baekjoon;

import java.util.Scanner;

public class bj_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean ck = true;
		
		for(int i = 0,l = str.length()-1;i < str.length()/2;i++,l--) {
			if(str.charAt(i) != str.charAt(l)) {
				ck = false;
				break;
			}
		}
		
		if(ck) System.out.println(1);
		else System.out.println(0);

	}

}
