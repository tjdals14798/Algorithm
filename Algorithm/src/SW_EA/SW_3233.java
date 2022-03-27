package SW_EA;

import java.util.Scanner;

public class SW_3233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			long A = sc.nextInt();	long B = sc.nextInt();
			
			System.out.printf("#%d %d",tc,(A/B)*(A/B));
		}
	}

}
