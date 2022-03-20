package SW_EA;

import java.util.Scanner;

public class SW_5549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();

		for(int tc=1;tc<=T;tc++) {
			String N = sc.next(); int n = N.length();
			
			if(N.charAt(n-1)%2==0) {
				System.out.printf("#%d %s\n",tc,"Even");
			}else {
				System.out.printf("#%d %s\n",tc,"Odd");
			}
		}

	}

}
