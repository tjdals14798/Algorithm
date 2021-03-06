package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_16439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		int arr[][] = new int[N][M];
		int res[]=new int[N];
		
		for(int i=0;i<N;i++) {
			int max = 0;
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.nextInt();
				max=Math.max(arr[i][j], max);
				res[i]=max;
			}
			System.out.println(res[i]);
		}
		
		Arrays.sort(res);
		int R = 0;
		for(int i=N-1;i>=N-3;i--) {	
			R+=res[i];
		}
		System.out.println(R);
	}
//----------------------------------------------------정답----------------------------------------------------//
//	static int n,m,max=0;
//	static int[][] chicken;
//	static boolean[] visited;
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt(); // 회원 수 
//		m=sc.nextInt(); // 치킨 종류
//		
//		chicken=new int[n][m];
//		visited=new boolean[m];
//		
//		for(int i=0;i<n;i++)
//			for(int j=0;j<m;j++)
//				chicken[i][j]=sc.nextInt();
//		
//		dfs(0,0);
//		System.out.println(max);
//	}
//	
//	static void dfs(int depth,int start) {
//		// m 종류의 치킨 중 3개의 치킨이 선택됐다면
//		if(depth==3) {
//			int sum=0;
//			/*
//			 * 각 회원마다 선택된 3종류의 치킨 중 가장 선호도가 높은 치킨을 선택하고
//			 * 그 누적 합을 구해 최댓값을 갱신한다.
//			 */
//			for(int i=0;i<n;i++) {
//				int num=0;
//				for(int j=0;j<m;j++) {
//					// 선택된 치킨 중 가장 선호도가 높은 치킨 찾기
//					if(visited[j]==true)
//						num=Math.max(num, chicken[i][j]);
//				}
//				sum+=num;
//			}
//			
//			max=Math.max(max, sum);
//			return;
//		}
//		
//		// m개의 치킨 중 3개의 치킨을 중복 없이 선택
//		for(int i=start;i<m;i++) {
//			if(visited[i]==false) {
//				visited[i]=true;
//				dfs(depth+1,i+1);
//				visited[i]=false;
//			}
//		}
//	}
//}

}
