package ����;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class bj_18870 {

//	������ ���� N���� ��ǥ X1, X2, ..., XN�� �ִ�. �� ��ǥ�� ��ǥ ������ �����Ϸ��� �Ѵ�.
//	Xi�� ��ǥ ������ ��� X'i�� ���� Xi > Xj�� �����ϴ� ���� �ٸ� ��ǥ�� ������ ���ƾ� �Ѵ�.
//	X1, X2, ..., XN�� ��ǥ ������ ������ ��� X'1, X'2, ..., X'N�� ����غ���.

//	ù° �ٿ� N�� �־�����.
//	��° �ٿ��� ���� �� ĭ���� ���е� X1, X2, ..., XN�� �־�����.
	
//	ù° �ٿ� X'1, X'2, ..., X'N�� ���� �� ĭ���� �����ؼ� ����Ѵ�.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		int arr[]=new int[cnt]; //�Է� �迭
		int sarr[]=new int[cnt]; //���� �迭
		HashMap<Integer, Integer> rankmap = new HashMap<Integer, Integer>(); // rank�� �ű� hashmap
		
		for(int i = 0; i < cnt; i++) {
			sarr[i]=arr[i]=sc.nextInt(); //���ÿ� �� �Է�
		}
		
		//����
		Arrays.sort(sarr);

		//���ĵ� sarr�� ��ȸ�ϸ鼭 map�� �־���
		int rank = 0;
		for(int r : sarr) {		
			if(!rankmap.containsKey(r)) {
				rankmap.put(r,rank);
				rank++; //��ũ ����
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : arr) {
			int ranking = rankmap.get(key); // key�� ���� ���� ��
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
	}

}
