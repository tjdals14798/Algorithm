package Àç±Í;

import java.util.Scanner;

public class bj_10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int result = sc.nextInt();
		
		System.out.println(fibo(result));
	}
	
	public static int fibo(int num) {
			if(num==0) {
				return 0;
			}
			if(num==1) {
				return 1;
			}
		return fibo(num-1)+fibo(num-2);
	}

}
