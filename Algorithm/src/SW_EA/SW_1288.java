package SW_EA;

import java.util.Scanner;

public class SW_1288 {
//	�μ��̴� 1�� ����� ������� ���� ���� ��̾��� �� ���Ƽ� N�� ��� ��ȣ�� ���� ����� �Ͽ���.
//	��, ù ��°���� N�� ���� ����, �� ��°���� 2N�� ��, �� , k��°���� kN�� ���� ����.
//	5N�� ���� ���� 0���� 9���� ��� ���ڸ� ���� �ǹǷ� �μ��̴� �� ���⸦ �����.

//	ù ��° �ٿ� �׽�Ʈ ���̽��� �� T�� �־�����.

//	�� �׽�Ʈ ���̽��� ù ��° �ٿ��� N (1 �� N �� 106)�� �־�����.
	
//	�� �׽�Ʈ ���̽����� ��#x��(x�� �׽�Ʈ���̽� ��ȣ�� �ǹ��ϸ� 1���� �����Ѵ�)�� ����ϰ�,
//	�ּ� �� �� ���� ������ �� ������ �ô� ���ڵ��� �ڸ������� 0���� 9������ ��� ���ڸ� ���� �Ǵ��� ����Ѵ�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int N = sc.nextInt();
			int c = N;
			boolean arr[] = new boolean[10];
			int cnt=1;
			
		while(true) {
			int sum = 0;
			c=cnt*N;
			String b=c+"";
			
			for(int q = 0;q<b.length();q++) {
				int a = c%10;
				arr[a]=true;
				c/=10;
			}
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==true) {
					sum++;//0~9
				}
			}
			
			if(sum==10)break;
			else cnt++;

		}
		
		System.out.println("#"+i+" "+(N*cnt));
		}
	}

}
