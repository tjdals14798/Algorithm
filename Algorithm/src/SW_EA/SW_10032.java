package SW_EA;

import java.util.Scanner;

public class SW_10032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			int N =sc.nextInt(); int K = sc.nextInt();
			if(N%K==0) {
				System.out.printf("#%d %d\n",tc,0);				
			}else {
				System.out.printf("#%d %d\n",tc,1);
			}
		}

	}

}
