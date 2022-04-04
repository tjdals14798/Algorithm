package SW_EA;

import java.util.Scanner;

public class SW_9658 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1;tc <= T;tc++) {
			String str = sc.next();
			int n = Integer.parseInt(str.substring(0, 3));
			int len = str.length()-1;
			
			double res = Math.round(n/10.0)/10.0;
			if (res >= 10) {
                System.out.printf("#%d %.1f*10^%d%n", tc, res/10, len+1);
            }else {
            	System.out.printf("#%d %.1f*10^%d%n", tc, res, len);
            	
            }
             
 
		}

	}

}
