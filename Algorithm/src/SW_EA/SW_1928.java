package SW_EA;

import java.util.Base64;
import java.util.Scanner;

public class SW_1928 {
//	�Է����� Base64 Encoding �� String �� �־����� ��, �ش� String �� Decoding �Ͽ�, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	���ڿ��� ���̴� �׻� 4�� ����� �־�����. �׸��� ���ڿ��� ���̴� 100000�� ���� �ʴ´�.

//	�Է��� ù �ٿ� �� �׽�Ʈ ���̽��� ���� T�� �´�. ���� �ٺ��� �� �׽�Ʈ ���̽��� �־�����.
//	�׽�Ʈ ���̽��� Encoding �� ���·� �־����� ���ڿ��̴�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			String N = sc.next();
			String V = new String(Base64.getDecoder().decode(N));
			System.out.println("#"+i+" "+V);
		}
	}
}
