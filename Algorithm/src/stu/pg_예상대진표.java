package stu;

import java.util.Scanner;

public class pg_예상대진표 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
		int cnt = 0;
		while(true) {
			a = a/2 + a%2;
			b = b/2 + b%2;
			
			cnt++;
			if(a == b) break;
		}
		System.out.println(cnt);
	}

}
