package SW_EA;

import java.util.Scanner;

public class SW_13218 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			System.out.printf("#%d %d\n",tc,N/3);
		}
		

	}

}
