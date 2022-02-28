package SW_EA;

import java.util.Scanner;

public class SW_12368 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int A=sc.nextInt();int B=sc.nextInt();
			int sum=A+B;
			int res=0;
			if(sum<24) {
				System.out.printf("#%d %d\n",tc,sum);
			}else if(sum==24) {
				System.out.printf("#%d %d\n",tc,0);
			}
			else {
				res=sum%24;
				System.out.printf("#%d %d\n",tc,res);
			}
		}

	}

}
