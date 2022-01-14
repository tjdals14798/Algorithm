package 문자열;

import java.util.Scanner;

//	N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

//	첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.

//	입력으로 주어진 숫자 N개의 합을 출력한다.

public class bj_11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String val = sc.next();
		int sum =0;
		
		for(int i = 0; i<num ;i++) {
			sum+=val.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
