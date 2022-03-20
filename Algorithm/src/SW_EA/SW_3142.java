package SW_EA;

import java.util.Scanner;

public class SW_3142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int n=sc.nextInt(); int m=sc.nextInt();
			int res = n-m;
			System.out.printf("#%d %d %d\n",tc,(m-res),res);		
		}
	}

}
