package SW_EA;

import java.util.Scanner;

public class SW_10059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			String str = sc.next();
			
			int F = Integer.parseInt(str.substring(0, 2)); int E = Integer.parseInt(str.substring(2));

			if (F >= 1 && F <=12) {
                if (E >= 1 && E <= 12) {
                    System.out.printf("#%d %s\n",tc,"AMBIGUOUS");
                } else {
                	System.out.printf("#%d %s\n",tc,"MMYY");
                }
            } else if (E >= 1 && E <=12) {
                if (F >= 1 && F <= 12) {
                	System.out.printf("#%d %s\n",tc,"AMBIGUOUS");
                } else {
                	System.out.printf("#%d %s\n",tc,"YYMM");
                }
            } else {
            	System.out.printf("#%d %s\n",tc,"NA");
            }
		}
	}

}
