package SW_EA;

import java.util.Scanner;

public class SW_1933 {
//	�Է����� 1���� ���� N �� �־�����.
//	���� N �� ����� ������������ ����ϴ� ���α׷��� �ۼ��϶�.

//	N�� 1�̻� 1,000������ �����̴�. (1 �� N �� 1,000)

//	�Է����� ���� N �� �־�����.

//	���� N �� ��� ����� ������������ ����Ѵ�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
