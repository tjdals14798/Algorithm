package SW_EA;

import java.util.Scanner;

public class SW_8457 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(), B = sc.nextInt(), E = sc.nextInt();
			int cnt = 0;
			
			for (int i = 0; i < N; i++) {
				int num = sc.nextInt();
				int k = 1, res = 0;

				while (res <= B+E) {
					res = num * k;
					k++;

					if (res >= B-E && res <= B+E) {
						cnt++;
						break;
					}
				}
			}
			System.out.printf("#%d %d\n",tc,cnt);
		}
	}
}