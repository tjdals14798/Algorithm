package SW_EA;

import java.util.Scanner;

public class SW_4406 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char M[]={'a','e','i','o','u'};
		
		for (int tc = 1;tc <= T;tc++) {
			String str = sc.next(); String res = "";
			
			for(int i=0;i<str.length();i++) {
				boolean ck=false; 
				for(int j=0;j<M.length;j++) {
					if(str.charAt(i)==M[j]) ck=true;
				}
				if(!ck) res+=str.charAt(i);
			}			
			System.out.printf("#%d %s\n",tc,res);
			
		}

	}

}
