package stu;

public class pg_�����ﰢ�� {

	public static void main(String[] args) {
		int arr[][] = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
		int dp[][] = new int [arr.length][arr.length];
		dp[0][0] = arr[0][0];
		
		for(int i = 1; i < arr.length; i++) {
			dp[i][0] = arr[i][0] + dp[i-1][0];	//dp[i][0]�� ù��° �� ����
			
			for(int j = 1 ;j < i+1 ;j++) {	//dp[i][j] i�� Ŀ������ �� ���� Ž��
				dp[i][j] = arr[i][j] + Math.max(dp[i-1][j-1],dp[i-1][j]); //dp�� �� ū�� ����
			}
			
		}
			int max = 0;
			for(int i = 0; i < dp.length;i++) {	//�������� �˻�
				max = Math.max(dp[dp.length-1][i], max);
			}
		System.out.println(max);
	}

}
