package ���Ʈ_����;

import java.util.Scanner;

public class bj_2231 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int res = 0;
		
		for(int i=0; i<cnt; i++) {
			//��� �ʱ�ȭ
			int num = i;
			int sum = 0;
			//������ �ڸ� ���ϱ�
			while(num!=0) {
				sum+=num%10;
				num/=10;
			}
			//������ ã��
			if(sum+i==cnt) {
				res=i;
				break;
			}
		}
		
		System.out.println(res);

	}

}
