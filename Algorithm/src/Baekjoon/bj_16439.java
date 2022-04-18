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
//----------------------------------------------------����----------------------------------------------------//
//	static int n,m,max=0;
//	static int[][] chicken;
//	static boolean[] visited;
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		n=sc.nextInt(); // ȸ�� �� 
//		m=sc.nextInt(); // ġŲ ����
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
//		// m ������ ġŲ �� 3���� ġŲ�� ���õƴٸ�
//		if(depth==3) {
//			int sum=0;
//			/*
//			 * �� ȸ������ ���õ� 3������ ġŲ �� ���� ��ȣ���� ���� ġŲ�� �����ϰ�
//			 * �� ���� ���� ���� �ִ��� �����Ѵ�.
//			 */
//			for(int i=0;i<n;i++) {
//				int num=0;
//				for(int j=0;j<m;j++) {
//					// ���õ� ġŲ �� ���� ��ȣ���� ���� ġŲ ã��
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
//		// m���� ġŲ �� 3���� ġŲ�� �ߺ� ���� ����
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
