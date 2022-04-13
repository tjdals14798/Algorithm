package Baekjoon;

import java.util.Scanner;

public class bj_24509 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][5];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int res[]=new int[4];
		
		for(int i=1;i<=4;i++) {
			int max=0, index = 0, rank = 0;

			for(int j=0;j<N;j++) {
				if(arr[j][i]>max) {
					max=arr[j][i];
					index=j;
					rank = arr[j][0];
					res[i-1]=rank;
				}
			}
			
			for(int k=1;k<=4;k++) {
				arr[index][k]=0;
			}
			
		}
		for(int i=0;i<4;i++) {
			System.out.print(res[i]+" ");
		}
		
	}

}
