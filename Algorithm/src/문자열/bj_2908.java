package ���ڿ�;

import java.util.Scanner;

public class bj_2908 {
	
//	������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���.
//	����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
//	����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
//	����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
//	�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.

//	ù° �ٿ� ����� ����� ����Ѵ�.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n1 = sc.next();
		String n2 = sc.next();	
		char c1 = ' ';
		char c2 = ' ';
		String v1="";
		String v2="";
		
		for(int i = 2;0<=i;i--) {
			c1 = n1.charAt(i);
			c2 = n2.charAt(i);
			
			v1+=c1;
			v2+=c2;
		}
		if(Integer.parseInt(v1)>Integer.parseInt(v2)) {
			System.out.println(v1);
		}else {
			System.out.println(v2);
		}
	}

}
