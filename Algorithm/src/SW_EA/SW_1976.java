package SW_EA;

import java.util.Scanner;

public class SW_1976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int at=sc.nextInt(); int am=sc.nextInt();
			int bt=sc.nextInt(); int bm=sc.nextInt();
			int st=0; int sm=0; int nt=0; int ns=0;
			
			st=at+bt; sm=am+bm;
			
			if(st>=13) {
				nt=st%12;
				st=0;
				st=+nt;
				
			}
			
			if(sm>=60) {
				ns=sm%60;
				sm=0;st+=1;
				sm=+ns;
			}
			
			System.out.printf("#%d %d %d\n",tc,st,sm);
		}

	}

}
