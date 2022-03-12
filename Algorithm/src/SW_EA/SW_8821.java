package SW_EA;

import java.util.Scanner;

public class SW_8821 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			String str=sc.next();
			boolean arr[]=new boolean[10];
			int cnt=0;
			
			for(int i=0;i<str.length();i++) {
				int index=str.charAt(i)-'0';
				if(arr[index]) {
					arr[index]=false;
					cnt--;
				}else {
					arr[index]=true;
					cnt++;
				}
			}
			System.out.printf("#%d %d\n",tc, cnt);
		}

	}

}
