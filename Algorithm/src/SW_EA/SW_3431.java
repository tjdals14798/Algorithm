package SW_EA;

import java.util.Scanner;

public class SW_3431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1;tc <= T;tc++) {
			int L =sc.nextInt(), U = sc.nextInt(), X = sc.nextInt();
			
			if(L>X) System.out.printf("#%d %d\n",tc,L-X);
			else if(L<=X && U>=X) System.out.printf("#%d %d\n",tc,0);
			else  System.out.printf("#%d %d\n",tc,-1);		
		}

	}

}
