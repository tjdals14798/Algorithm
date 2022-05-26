package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_2600 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] B = new int[3];
		for (int i = 0; i < 3; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[501];
		dp[0] = 0;

		boolean[] check = new boolean[4];
		for (int i = 1; i <= 500; i++) {
			Arrays.fill(check, false);

			// ������ �´� ���� ������ �׷��� ���� true�� �ʱ�ȭ ��.
			for (int j = 0; j < 3; j++) {
				if (i - B[j] >= 0) {
					check[dp[i - B[j]]] = true;
				}
			}

			// max�� ���ϴ� ����.
			int max = 0;
			while (check[max]) {
				max++;
			}
			dp[i] = max;
		}

		int T = 5;
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());

			int k1 = Integer.parseInt(st.nextToken());
			int k2 = Integer.parseInt(st.nextToken());

			System.out.print((dp[k1] ^ dp[k2]) == 0 ? "B\n" : "A\n");
		}
	}

}