package stu;

import java.util.Scanner;

public class pg_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1;i <= n;i++) {
			int res = i;
			for(int j = i+1;j < n;j++) {
				res += j;
				if(res==n) cnt++;
			}
		}
		System.out.println(cnt+1);

	}

}
