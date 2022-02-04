package bj_bronze;

import java.util.Scanner;

public class bj_2167 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt();
		int M =sc.nextInt();
		int arr[][] = new int[N][M];
		
		for(int i = 0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int cnt = sc.nextInt();
		
		for(int q = 0;q<cnt;q++) {
			int sum = 0;
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			
			for(int i1=i;i1<=x;i1++) {
				for(int j1=j;j1<=y;j1++) {
					sum+=arr[i1][j1];
				}
			}
			System.out.println(sum);
		}
		
	}

}
