package Baekjoon;

import java.util.Scanner;

public class bj_20154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {3,2,1,2,3,3,3,3,1,1,3,1,3,3,1,2,2,2,1,2,1,1,2,2,2,1};
		int sum = 0;
		String str = sc.next();
		
		for(int i = 0;i<str.length();i++) {
			int idx = str.charAt(i)-'A';
			sum += arr[idx];
		}
		sum%=10;
		System.out.println(sum%2!=0?"I'm a winner!" : "You're the winner?");
		
	}

}
