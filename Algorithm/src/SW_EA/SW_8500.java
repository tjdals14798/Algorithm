package SW_EA;

import java.util.Scanner;

public class SW_8500 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int T=sc.nextInt();
	         
	        for(int tc = 1; tc <= T; tc++) {
	            int N = sc.nextInt();
	            int max = 0;
	            int res = 0;
	            for(int i = 0; i < N; i++) {
	                int seat = sc.nextInt();
	                if(max < seat) {
	                    max = seat;
	                }
	                res += seat + 1;
	            }
	            res += max;
	            System.out.printf("#%d %d\n",tc,res);
	        }
	    }
	}
