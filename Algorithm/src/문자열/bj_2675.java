package ���ڿ�;

import java.util.Scanner;

public class bj_2675 {
	
//	���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ù ��° ���ڸ� R�� �ݺ��ϰ�,
//	�� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
//	QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.

//	ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8),
//	���ڿ� S�� �������� ���еǾ� �־�����. S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
	
//	�� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		for(int i = 0;i<cnt;i++) {
			
			 int num = sc.nextInt();
			 String str = sc.next();
			 
			 for(int j = 0;j<str.length();j++) {
				 for(int q = 0;q<num;q++) {
					 
					 System.out.print(str.charAt(j));
				 
				 }
			 }
			 System.out.println();
		}

	}

}
