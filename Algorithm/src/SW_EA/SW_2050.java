package SW_EA;

import java.util.Scanner;

public class SW_2050 {
//	���ڿ��� �ִ� ���̴� 200�̴�.

//	���ĺ����� �̷���� ���ڿ��� �־�����.

//	�� ���ĺ��� ���ڷ� ��ȯ�� ������� �� ĭ�� �ΰ� ����Ѵ�.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		
		for(int i=0;i<b.length();i++) {
			int n = b.charAt(i)-64;
			System.out.print(n+" ");
		}
	}

}
