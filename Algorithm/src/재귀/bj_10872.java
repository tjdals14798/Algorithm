package ���;

import java.util.Scanner;

public class bj_10872 {
	
//	0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.

//	ù° �ٿ� N!�� ����Ѵ�.
	
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
