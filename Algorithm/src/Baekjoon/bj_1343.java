package Baekjoon;

import java.util.Scanner;

public class bj_1343 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String A = "AAAA", B = "BB";
		int cnt = 0;
		String res = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'X') {
				cnt++;
			}else{
				if(cnt%2 == 1) {
					res = "-1";
					break;
				}
				
				while(cnt != 0) {
					if(cnt >= 4) {
						res += A;
						cnt -= 4;
					}else {
						res += B;
						cnt -= 2;
					}
				}
				res += ".";
			}
		}
		if(cnt > 0) {
			if(cnt%2 == 1) {
				res = "-1";
			}else {
				while(cnt != 0) {
					if(cnt >= 4) {
						res += A;
						cnt -= 4;
					}else {
						res += B;
						cnt -= 2;
					}
				}
			}
		}
		System.out.println(res);
	}

}
