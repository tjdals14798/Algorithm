package SW_EA;

import java.util.Scanner;

public class SW_2025 {
//	1���� �־��� ���ڸ�ŭ ��� ���� ���� ����Ͻÿ�.
//	��, �־��� ���ڴ� 10000�� ���� �ʴ´�.

//	�־��� ���ڰ� 10 �� ��� ����ؾ� �� ������,
//	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
