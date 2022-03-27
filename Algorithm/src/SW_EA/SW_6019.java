package SW_EA;

import java.util.Scanner;

public class SW_6019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			double D = sc.nextInt();	double A = sc.nextInt();
			double B = sc.nextInt();	double F = sc.nextInt();
			
			double Ti = D / (A+B);
			double res = Ti*F;
			System.out.printf("#%d %.6f\n",tc,res);
		}
	}

}
