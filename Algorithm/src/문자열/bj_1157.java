package ���ڿ�;

import java.util.Scanner;

public class bj_1157 {

//	���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

//	ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.

//	ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[]=new int[26];
		
		String str = sc.next().toUpperCase();
		
		for(int i = 0;i<str.length();i++) {
			int num = str.charAt(i)-'A';
			arr[num]++;
		}
		
		int max = 0;
		char val = '?';
		
		for(int i = 0; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				val = (char)(i+'A');
			}else if(max==arr[i]) {
				val='?';
			}
		}
		System.out.println(val);
	}

}
