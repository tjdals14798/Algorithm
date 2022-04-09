package bj_bronze;

import java.util.Scanner;

public class bj_6246 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), Q = sc.nextInt(), cnt = 0;
		boolean[] ck = new boolean[N+1];
		
		for(int i=0;i<Q;i++) {
			int L = sc.nextInt(), I = sc.nextInt();
			for(int j=L;j<ck.length;j+=I) {
				ck[j]= true;
			}
		}
		
		for(int j=1;j<ck.length;j++) {
			if(!ck[j]) cnt++;
		}
		System.out.println(cnt);
	}

}
