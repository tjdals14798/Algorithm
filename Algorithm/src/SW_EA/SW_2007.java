package SW_EA;

import java.util.Scanner;

public class SW_2007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			String str = sc.next();
			for(int i=1;i<=str.length();i++) {
				String F = str.substring(0,i);
				String B = str.substring(i,i+i);
				if(F.equals(B)) {
					System.out.println("#"+tc+" "+F.length());
					break;
				}
				
			}
			
		}

	}

}
