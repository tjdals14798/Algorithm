package SW_EA;

import java.util.Scanner;

public class SW_4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int D = sc.nextInt(); int H = sc.nextInt(); int M = sc.nextInt(); int sum=0;
			
			sum += M-11 + (H-11)*60 + (D-11)*1440;
			
			if(sum<0) System.out.printf("#%d %d\n",tc,-1);
			else System.out.printf("#%d %d\n",tc,sum);
		}

	}

}
