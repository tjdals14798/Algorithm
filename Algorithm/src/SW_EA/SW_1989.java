package SW_EA;

import java.util.Scanner;

public class SW_1989 {
//	"level" �� ���� �Ųٷ� �о ����� ���� �Ͱ� ���� �����̳� ������ ȸ��(����, palindrome)�̶� �Ѵ�.
//	�ܾ �Է� �޾� ȸ���̸� 1�� ����ϰ�, �ƴ϶�� 0�� ����ϴ� ���α׷��� �ۼ��϶�.

//	�� �ܾ��� ���̴� 3 �̻� 10 �����̴�.
	
//	���� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����, �� �Ʒ��� �� �׽�Ʈ ���̽��� �־�����.
//	�� �׽�Ʈ ���̽��� ù ��° �ٿ� �ϳ��� �ܾ �־�����.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb =null;
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			String N = sc.next();
			sb = new StringBuffer(N);
			if(N.equals(sb.reverse().toString())) System.out.println("#"+i+" "+1);
			else System.out.println("#"+i+" "+0);
		}
	}

}
