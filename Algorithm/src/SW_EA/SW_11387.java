package SW_EA;

import java.util.Scanner;

public class SW_11387 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int D=sc.nextInt();int L=sc.nextInt();int N=sc.nextInt();
			int res=0;
			for(int i=0;i<N;i++) {
				res+=D*(1+i*L*0.01);
			}
			System.out.printf("#%d %d\n",tc,res);
		}
	}

}
