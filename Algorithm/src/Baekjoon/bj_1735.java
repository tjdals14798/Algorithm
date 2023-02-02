package Baekjoon;

import java.util.Scanner;

public class bj_1735 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(),b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		a = (a * d) + (c * b);
		b = b * d;
		int gcd = getGCD(a, b);
		System.out.println(a / gcd + " "+ b / gcd);
	}
	
	 public static int getGCD(int num1, int num2) {
		 if (num1 % num2 == 0) {
	        return num2;
	     }
	     return getGCD(num2, num1%num2);
	 }

}
