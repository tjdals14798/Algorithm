package stu;

import java.util.Scanner;

public class pg_4 {

//	0�� 1�� �̷���� � ���ڿ� x�� ���� ���� ��ȯ�� ������ ���� �����մϴ�.
//	x�� ��� 0�� �����մϴ�.
//	x�� ���̸� c��� �ϸ�, x�� "c�� 2�������� ǥ���� ���ڿ�"�� �ٲߴϴ�.
//	���� ���, x = "0111010"�̶��, x�� ���� ��ȯ�� ���ϸ� x = "0111010" -> "1111" -> "100" �� �˴ϴ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int [] cnt = new int[2];
		
		while(!str.equals("1")) {
			for(int i = 0; i < str.length();i++) {
				if(str.charAt(i)=='0') cnt[1]++; // 0 Ȯ��			
			}
			str = str.replace("0", "");  // 0 ����
			str = Integer.toBinaryString(str.length());  //str�� ���̸� 2�� ��ȯ
			cnt[0]++;
		}
		System.out.println(cnt[0]+" "+cnt[1]);

	}

}
