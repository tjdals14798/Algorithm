package SW_EA;

import java.util.Scanner;

public class SW_1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int res[]=new int[101];
			int max=0;
			int val=0;
				
			int TC=sc.nextInt();
			
			for(int i=0;i<1000;i++) {
				int score=sc.nextInt();
				res[score]++;
			}
			
			for(int i=0;i<101;i++) {
				if(max<=res[i]) {
					max=res[i];
					val=i;
				}
			}
			System.out.printf("#%d %d\n",tc,val);
		}
	}

}
