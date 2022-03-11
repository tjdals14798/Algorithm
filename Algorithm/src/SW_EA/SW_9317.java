package SW_EA;

import java.util.Scanner;

public class SW_9317 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			String ex = sc.next();
			String ch = sc.next();
			int cnt=0;
			
			for(int i=0;i<N;i++) {
				if(ex.charAt(i)==ch.charAt(i)) {
					cnt++;
				}
			}
			System.out.printf("#%d %d",tc,cnt);
		}


	}

}
