package SW_EA;

import java.util.Scanner;

public class SW_2043 {
//	������ ��й�ȣ�� ������ ���� �ʴ´�.
//	��й�ȣ P�� 000���� 999���� ��ȣ ���� �ϳ��̴�.
//	�־����� ��ȣ K���� 1�� �����ϸ� ��й�ȣ�� Ȯ���� �� �����̴�.
//	���� ��� ��й�ȣ P�� 123 �̰� �־����� ��ȣ K�� 100 �� ��, 100���� 123���� 24�� Ȯ���Ͽ� ��й�ȣ�� ���� �� �ִ�.
//	P�� K�� �־����� K���� �����Ͽ� �� �� ���� P�� ���� �� �ִ��� �˾ƺ���.

//	�Է����� P�� K�� �� ĭ�� ���̷� �־�����.

//	�� �� ���� ��й�ȣ�� ���� �� �ִ��� ����Ѵ�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		int K = sc.nextInt();
		int cnt = 0;
		
		for(int i = K;i<=P;i++) {
			cnt++;
		}
		System.out.println(cnt);
	}

}
