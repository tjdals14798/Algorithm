package SW_EA;

import java.util.Scanner;

public class SW_13229 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int T = sc.nextInt();
		String D[] = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
		for(int tc=1;tc<=T;tc++) {
			String S = sc.next();
			int cnt=0;
			
			for(int i=0;i<D.length;i++) {
				if(D[i].equals(S)) {
					cnt=i+1;
				}			
			}
			if(cnt==7) System.out.printf("#%d %d\n",tc,cnt);
			else System.out.printf("#%d %d\n",tc,D.length-cnt);
		}
	}

}
