package 재귀;

import java.util.Scanner;

public class bj_10872 {
	
//	0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.

//	첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.

//	첫째 줄에 N!을 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int result = fac(sc.nextInt());

		System.out.println(result);
	}
	
	public static int fac(int num) {
		
		if(num==1||num==0) {
			return 1;
		}else {		
			return num*fac(num-1);
		}
		
	}

}
