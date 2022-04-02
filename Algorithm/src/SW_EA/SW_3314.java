package SW_EA;

import java.util.Scanner;

public class SW_3314 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1;tc <= T;tc++) {
			int sum=0;
			
			for(int i=0;i<5;i++) {
				int n=sc.nextInt();
				if(n<40) n=40;
				
				sum+=n;
			}
			
			System.out.printf("#%d %d",tc,sum/5);
			
		}
		
		
	}

}
