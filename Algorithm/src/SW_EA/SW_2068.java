package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_2068 {
//	�� ���� 0 �̻� 10000 ������ �����̴�.

//	���� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����, �� �Ʒ��� �� �׽�Ʈ ���̽��� �־�����.
//	�� �׽�Ʈ ���̽��� ù ��° �ٿ��� 10���� ���� �־�����.

//	����� �� ���� '#t'�� �����ϰ�, ������ �� ĭ �� ���� ������ ����Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[] = new int[10];
	
		for(int i=1;i<=T;i++) {
			
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("#"+i+" "+arr[arr.length-1]);
		}
	}

}
