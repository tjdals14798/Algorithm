package bj_bronze;

import java.util.Scanner;
//	� �� X�� �־����� ��, X�� ��� �ڸ����� ������ �� ���� ���� �� �ִ�. Rev(X)�� X�� ��� �ڸ����� �������� ����� �Լ���� ����. 
//	���� ���, X=123�� ��, Rev(X) = 321�̴�. �׸���, X=100�� ��, Rev(X) = 1�̴�.
//	�� ���� ���� X�� Y�� �־����� ��, Rev(Rev(X) + Rev(Y))�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�

///	ù° �ٿ� �� X�� Y�� �־�����. X�� Y�� 1,000���� �۰ų� ���� �ڿ����̴�.

//	ù° �ٿ� ������ ������ ����Ѵ�.
public class bj_1357 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x = Rev(sc.nextInt());
		int y = Rev(sc.nextInt());
		
		int res=Rev(x+y);
		System.out.println(res);
	}

	public static int Rev(int rev) {
		String res="";
		while(rev>0) {
			res+=rev%10;
			rev/=10;
		}
		return Integer.parseInt(res);
	}
}
