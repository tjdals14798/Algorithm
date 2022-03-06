package SW_EA;

import java.util.Scanner;

public class SW_10761 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int bcnt=0, ocnt=0, cnt=0;
			int O=1, B=1;
			
			for(int i=0;i<N;i++) {
				char R = sc.next().charAt(0);
				int x = sc.nextInt();
				
				if (R=='B') {
                    int time = (bcnt >= Math.abs(B-x))? 1:1+Math.abs(B-x)-bcnt;
                    cnt += time;
                    ocnt += time;
                    bcnt = 0;
                    B = x;
                } else if (R=='O') {
                    int time = (ocnt >= Math.abs(O-x))? 1:1+Math.abs(O-x)-ocnt;
                    cnt += time;
                    bcnt += time;
                    ocnt = 0;
                    O = x;
                }
            }
            System.out.printf("#%d %d\n",tc,cnt);
			}
	}

}
