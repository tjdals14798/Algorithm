package SW_EA;

import java.util.Scanner;

public class SW_5162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int tc = 1; tc <= T; tc++) {
        	int A = sc.nextInt(); int B = sc.nextInt(); int C = sc.nextInt();      	
        	int min = Math.min(A, B);      	
        	System.out.printf("#%d %d",tc,C/min);
        }

	}

}
