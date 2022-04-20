package SW_EA;

import java.util.Scanner;

public class SW_14178 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1;tc<=T;tc++) {
			int N = sc.nextInt(), D = sc.nextInt(),cnt=0;
			int sp = (D*2)+1;
			boolean ck[] = new boolean[N];
			
			
			for(int i=D;i<ck.length;i+=sp) {
				ck[i]=true;
			}
			
			for(int i=0;i<ck.length;i++) {
				if(ck[i]==true) cnt++;
			}
			if(N%sp<D+1&&N%sp!=0)cnt+=1;
			System.out.printf("#%d %d\n",tc,cnt);

		}

	}

}
