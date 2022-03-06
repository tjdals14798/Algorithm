package SW_EA;

import java.util.Scanner;

public class SW_10804 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb=null;
		StringBuilder sbd=null;
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			sb = new StringBuffer(sc.next());
			String str = sb.reverse().toString();
			sbd = new StringBuilder(str);
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='b') sbd.setCharAt(i, 'd');
				else if(str.charAt(i)=='d') sbd.setCharAt(i, 'b');
				else if(str.charAt(i)=='p') sbd.setCharAt(i, 'q');
				else sbd.setCharAt(i, 'p');
			}
			System.out.printf("#%d %s\n",tc,sbd);
		}
	}

}
