package ���ڿ�;

import java.util.Scanner;

//	N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.

//	�Է����� �־��� ���� N���� ���� ����Ѵ�.

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
