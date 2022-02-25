package SW_EA;

import java.util.Scanner;

public class SW_13547 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			String S=sc.next();
			
			int cnt=0;//½Â¸®
			
			for(int i=0;i<S.length();i++) {
				char C = S.charAt(i);
				if(C=='o') cnt++;//½Â¸®½Ã ++
			}
			
			int res = 15-S.length();
			if(cnt+res>=8) System.out.printf("#%d %s\n",tc,"YES");
			else System.out.printf("#%d %s\n",tc,"NO");
			
			/*
			 * if(S.length()==15) { if(cnt>7) System.out.printf("#%d %s\n",tc,"YES"); else
			 * System.out.printf("#%d %s\n",tc,"NO"); }else { if(fcnt<7)
			 * System.out.printf("#%d %s\n",tc,"YES"); else
			 * System.out.printf("#%d %s\n",tc,"NO"); }
			 */
		}
	}

}
