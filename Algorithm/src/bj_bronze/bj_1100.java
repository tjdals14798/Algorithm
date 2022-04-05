package bj_bronze;

import java.util.Scanner;

public class bj_1100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;	int res = 0;
		
		for(int i = 0;i<8;i++) {
			String str = sc.next();
			if(cnt%2==0) {
				for(int j=0 ;j <= 6;j+=2) {		//0 2 4 6
					if(str.charAt(j)=='F') res++;
				}
			}else {
				for(int j=1 ;j <= 7;j+=2) {		//1 3 5 7
					if(str.charAt(j)=='F') res++;
				}
			}
			cnt++;
		}
		
		System.out.println(res);

	}

}
