package Baekjoon;

import java.util.Scanner;

public class bj_1284 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			int cnt = 2;
			
			if(str.equals("0")) break;
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='1') cnt+=2;
				else if(str.charAt(i)=='0') cnt+=4;
				else cnt+=3;
			}
			
			System.out.println(cnt+(str.length()-1));
			
			
		}
		
	}

}
