package SW_EA;

import java.util.Scanner;

public class SW_1936 {
//	A�� B�� ������������ �Ͽ���.
//	������ 1, ������ 2, ���� 3���� ǥ���Ǹ� A�� B�� ������ �´��� �Է����� �־�����.
//	A�� B�߿� ���� �̰���� �Ǻ��غ���. ��, ���� ���� ����.

//	�Է����� A�� B�� ������ �´��� �� ĭ�� ���̷� �־�����.
	
//	A�� �̱�� A, B�� �̱�� B�� ����Ѵ�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==1&&b==2)System.out.println("B");
		else if(a==1&&b==3)System.out.println("A");
		
		if(a==2&&b==3)System.out.println("B");
		else if(a==2&&b==1)System.out.println("A");
		
		if(a==3&&b==1)System.out.println("B");
		else if(a==3&&b==2)System.out.println("A");
	}

}
