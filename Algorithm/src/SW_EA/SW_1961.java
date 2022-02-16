package SW_EA;

import java.util.Scanner;

public class SW_1961 {
//	N x N ����� �־��� ��, �ð� �������� 90��, 180��, 270�� ȸ���� ����� ����϶�.
	
//	N�� 3 �̻� 7 �����̴�.
	
//	���� ù �ٿ��� �׽�Ʈ ���̽��� ���� T�� �־�����, �� �Ʒ��� �� �׽�Ʈ ���̽��� �־�����.
//	�� �׽�Ʈ ���̽��� ù ��° �ٿ� N�� �־�����,
//	���� N �ٿ��� N x N ����� �־�����.

//	����� ù ���� '#t'�� �����ϰ�, ���� N�ٿ� ���ļ� 90��, 180��, 270�� ȸ���� ����� ����Ѵ�.
//	�Է°��� �޸� ��¿����� ȸ���� ��� ���̿��� ������ �����Կ� �����϶�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int arr[][]=new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			int arr90[][]=rot(arr);			
			int arr180[][]=rot(arr90);
			int arr270[][]=rot(arr180);
			
			System.out.printf("#%d\n",tc);
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(arr90[i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<N;j++) {
					System.out.print(arr180[i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<N;j++) {
					System.out.print(arr270[i][j]);
				}
				System.out.println();
			}
		}

	}
	
	public static int[][] rot(int arr[][]) {
		int res[][]=new int[arr.length][arr.length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				res[i][j]=arr[arr.length-j-1][i];
			}
		}	
		return res;
	}

}
