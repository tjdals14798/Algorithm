package bj_bronze;

import java.util.Scanner;

public class bj_2738 {
//	N*Mũ���� �� ��� A�� B�� �־����� ��, �� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

//	ù° �ٿ� ����� ũ�� N �� M�� �־�����. ��° �ٺ��� N���� �ٿ� ��� A�� ���� M���� ���ʴ�� �־�����.
//	�̾ N���� �ٿ� ��� B�� ���� M���� ���ʴ�� �־�����. N�� M�� 100���� �۰ų� ����, ����� ���Ҵ� ������ 100���� �۰ų� ���� �����̴�.

//	ù° �ٺ��� N���� �ٿ� ��� A�� B�� ���� ����� ����Ѵ�. ����� �� ���Ҵ� �������� �����Ѵ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); int M = sc.nextInt();
		int ar1[][] = new int[N][M];
		int ar2[][] = new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				ar1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				ar2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(ar1[i][j]+ar2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
