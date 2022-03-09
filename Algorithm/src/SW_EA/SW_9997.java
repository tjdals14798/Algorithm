package SW_EA;

import java.util.Scanner;

public class SW_9997 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			
			int sum = N*2;
			
			System.out.printf("#%d %d %d\n",tc,sum/60,sum%60);
		}

	}

}
