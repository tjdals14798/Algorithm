package SW_EA;

import java.util.Scanner;

public class SW_12221 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int A=sc.nextInt();int B=sc.nextInt();
			
			if(A>=10||B>=10) System.out.printf("#%d %d\n",tc,-1);
			else System.out.printf("#%d %d\n",tc,A*B);			
		}

	}

}
