package SW_EA;

import java.util.Scanner;

public class SW_11856 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			String str = sc.next();
			boolean ck=false;
			int res=0;
			
			for(int i=0;i<str.length();i++) {
				int cnt=0;
				char a=str.charAt(i);
				for(int j=0;j<str.length();j++) {
					if(a==str.charAt(j)) cnt++;
				}
				if(cnt==2) {
					ck=true;
					res++;
				}else {
					ck=false;
				}
			}
			if(res==4) System.out.printf("#%d %s\n",tc,"Yes");
			else System.out.printf("#%d %s\n",tc,"No");
		}
		
	}

}
