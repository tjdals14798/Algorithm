package SW_EA;

import java.util.Scanner;

public class SW_1979 {
//	N X N ũ���� �ܾ� ������ ������� �Ѵ�. �Է����� �ܾ� ������ ����� �־�����.
//	�־��� ���� ��翡�� Ư�� ���� K�� ���� �ܾ �� �� �ִ� �ڸ��� ���� ����ϴ� ���α׷��� �ۼ��϶�.
	
//	1. N�� 5 �̻� 15 ������ �����̴�. (5 �� N �� 15)
//	2. K�� 2 �̻� N ������ �����̴�. (2 �� K �� N)

//	�Է��� ù �ٿ� �� �׽�Ʈ ���̽��� ���� T�� �´�.
//	���� �ٺ��� �� �׽�Ʈ ���̽��� �־�����.
//	�׽�Ʈ ���̽��� ù ��° �ٿ��� �ܾ� ������ ����, ���� ���� N ��, �ܾ��� ���� K �� �־�����.
//	�׽�Ʈ ���̽��� �� ��° �ٺ��� ������ ����� 2���� ������ �־�����.
//	������ �� �� ��, ��� �κ��� 1, ������ �κ��� 0 ���� �־�����.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt(); int K=sc.nextInt();
			int arr[][] = new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++){
					arr[i][j]=sc.nextInt();
				}
			}
			
			int res=0;
			//����
			for(int i=0;i<N;i++) {
				int cnt = 0;
				for(int j=0;j<N;j++){
					if(arr[i][j]==1)cnt++; 
					else {
						if(cnt==K) res++;
						cnt=0;
					}
				}
				if(cnt==K) res++;				
			}
			//����
			for(int i=0;i<N;i++) {
				int cnt = 0;
				for(int j=0;j<N;j++){
					if(arr[j][i]==1)cnt++;
					else {
						if(cnt==K) res++;
						cnt=0;
					}
				}
				if(cnt==K) res++;
			}
			System.out.println("#"+tc+" "+res);
		}
	}

}
