package Baekjoon;

import java.util.Scanner;

public class bj_2869 {
	
//	�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
//	�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
//	�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 �� B < A �� V �� 1,000,000,000)
	
//	ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		int day = (V-B)/(A-B);
		
		if((V-B)%(A-B)!=0) {
			day++;
		}
		System.out.println(day);
	}

}
