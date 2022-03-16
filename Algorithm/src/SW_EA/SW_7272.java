package SW_EA;

import java.util.Scanner;

public class SW_7272 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();
		char arr[]= {'A','D','O','P','Q','R'};
		char Ct='B';

		for(int tc=1;tc<=T;tc++) {
			String Ls = sc.next();	String Rs = sc.next();
			int Lc = 0;	int Rc = 0;
			
			if(Ls.length() != Rs.length()) {
				System.out.printf("#%d %s\n",tc,"DIFF");
	            continue;
	        }

			for(int i=0;i<Ls.length();i++) {
				for(int j=0;j<arr.length;j++) {
					if(Ls.charAt(i)==arr[j]) {
						Lc+=1; break;
					}
					else if(Ls.charAt(i)==Ct) {
						Lc+=2; break; 
					}
				}
			}
			
			for(int i=0;i<Rs.length();i++) {
				for(int j=0;j<arr.length;j++) {
					if(Rs.charAt(i)==arr[j]) {
						Rc+=1; break;
					}
					else if(Rs.charAt(i)==Ct) {
						Rc+=2; break;
					}
				}				
			}
			
			if(Lc==Rc) System.out.printf("#%d %s\n",tc,"SAME");
			else System.out.printf("#%d %s\n",tc,"DIFF");
		}

	}

}
