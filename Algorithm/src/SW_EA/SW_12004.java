package SW_EA;

import java.util.Scanner;

public class SW_12004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int i=1;
			String res="No";
			
			while(i<=9) {
				int a=N/i;
				if(a*i==N && N%i==0) {
					if(a<=9) {
						res="Yes";
					}
				}
				i++;
			}
			System.out.printf("#%d %s\n",tc,res);
			
		}

	}

}
