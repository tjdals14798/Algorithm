package SW_EA;

import java.util.Scanner;

public class SW_1961 {
//	N x N 행렬이 주어질 때, 시계 방향으로 90도, 180도, 270도 회전한 모양을 출력하라.
	
//	N은 3 이상 7 이하이다.
	
//	가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//	각 테스트 케이스의 첫 번째 줄에 N이 주어지고,
//	다음 N 줄에는 N x N 행렬이 주어진다.

//	출력의 첫 줄은 '#t'로 시작하고, 다음 N줄에 걸쳐서 90도, 180도, 270도 회전한 모양을 출력한다.
//	입력과는 달리 출력에서는 회전한 모양 사이에만 공백이 존재함에 유의하라.
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
