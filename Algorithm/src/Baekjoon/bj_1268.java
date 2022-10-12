package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bj_1268 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][5];
		int max = 0;
		int res = 0;
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < 5;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i = 0;i < n;i++) {	//	1�� �л�����
			Set<Integer> same = new HashSet<>();
			for(int j = 0;j < 5;j++) {	//	�г⺰��
				for(int k = 0;k < n;k++) {	//	�л�����
					if(arr[i][j] == arr[k][j] && i != k) {	//�������� �ڽŰ� ���� ���̾��ٸ�
						same.add(k);	//	�� �� �л�����
					}
				}
			}
			if(max < same.size()) {	//	������ ������� �ƴ»���� ���� �� ���ٸ�
				max = same.size();	// �ִ밪 ����
				res = i;	//	res�� i��° �л����� ����
			}
		}
		System.out.println(res+1);

	}

}
