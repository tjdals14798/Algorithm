package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_12865 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int w[] = new int[n+1], v[] = new int[k+1];
		for(int c = 1; c <= n; c++) {
			st = new StringTokenizer(br.readLine());
			w[c]= Integer.parseInt(st.nextToken());
			v[c] = Integer.parseInt(st.nextToken());
		}
		
		int dp[][] = new int[n + 1][k + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= k; j++) {
				dp[i][j] = dp[i - 1][j];	//������ ��ġ ����
				if(j - w[i] >= 0) {	//���Կ��� �ڽ��� ���Ը� ���� �� ���� ���԰� ����
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
					System.out.println(i+" "+j+" : "+dp[i][j]);
					// ���� �����ۿ��� ���� ��ġ�� ���� ������ ��ġ + �ڽ��� ��ġ �� ū ��
				}
			}
		}
		System.out.println(dp[n][k]);
		
		
//		int max = 0;
//		for(int i = 0; i < n; i++) {
//			int sum = 0;
//			for(int j = i+1; j < n; j++) {
//				if(arr[i][0]+arr[j][0] > v) {
//					sum = 0;
//					continue;
//				}
//				if(arr[i][0]+arr[j][0] <= v) {
//					sum = arr[i][1]+arr[j][1];
//					max = Math.max(sum, max);
//				}
//			}			
//		}
//		System.out.println(max);
	}

}
