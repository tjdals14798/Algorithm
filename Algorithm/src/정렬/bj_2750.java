package ����;

import java.util.Arrays;
import java.util.Scanner;

public class bj_2750 {

//	N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
//	ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� �� �־�����. �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.

//	ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		int arr[]=new int[cnt];
		
		for(int i = 0;i<cnt;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i = 0;i<cnt;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
