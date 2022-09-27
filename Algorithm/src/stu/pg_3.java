package stu;

import java.util.Scanner;

public class pg_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt;
		for(cnt=0;cnt<500;cnt++) {
			if(n==1) {
				System.out.println(cnt);
				break;
			}else {
				if(n%2==0) n /= 2;
				else n = n*3+1;
			}
			if(cnt==500) {
				System.out.println(-1);
				break;
			}
		}

	}

}
