package SW_EA;

import java.util.Scanner;

public class SW_1986 {
//	1���� N������ ���ڿ��� Ȧ���� ���ϰ� ¦���� ���� �� ���� ������ ���� ���غ���.

//	N�� 1 �̻� 10 ������ �����̴�. (1 �� N �� 10)

//	���� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����, �� �Ʒ��� �� �׽�Ʈ ���̽��� �־�����. �� �׽�Ʈ ���̽����� N�� �־�����.

//	�� ���� '#t'�� �����ϰ�, ������ �� ĭ �� ���� ������ ���� ����Ѵ�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int sum=1;
			int N = sc.nextInt();
			
			for(int j=2;j<=N;j++) {
				if(j%2==1) sum+=j;	
				else sum-=j;
			}
			System.out.println("#"+i+" "+sum);
		}
	}

}
