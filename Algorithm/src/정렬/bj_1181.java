package ����;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj_1181 {

//	���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	1.���̰� ª�� �ͺ���
//	2.���̰� ������ ���� ������

//	ù° �ٿ� �ܾ��� ���� N�� �־�����. (1 �� N �� 20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.

//	���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		String arr[] = new String[cnt];
		
		for(int i = 0; i<cnt; i++) {
			arr[i]=sc.next();
		}
		
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String s1,String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2);
				}else {
					return s1.length()-s2.length();
				}
			}
		
		});
			
		System.out.println(arr[0]);
		
		for(int i = 1;i < cnt;i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
			
	}

}
