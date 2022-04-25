package SW_EA;

import java.util.Scanner;

public class SW_4047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1;tc <= T;tc++) {
			
			int F[] = {13,13,13,13};
			String str = sc.next();
			String arr[][] = new String[str.length()/3][2];
			boolean ck = true;
			
			for(int i=0,j=0,k=1;i<str.length();i+=3,k+=3,j++) {
				arr[j][0]=str.charAt(i)+"";
				arr[j][1]=str.substring(k, k+2);
			}
			
			for(int i=0;i<arr.length;i++) {
				String s = arr[i][0]+arr[i][1];
				for(int j=i+1;j<arr.length;j++) {
					String ss = arr[j][0]+arr[j][1];
					if(s.equals(ss)) ck=false;
				}
				if(ck) {
					if(arr[i][0].equals("S")) F[0]-=1;
					else if(arr[i][0].equals("D")) F[1]-=1;
					else if(arr[i][0].equals("H")) F[2]-=1;
					else F[3]-=1;
				}
			}		
			if(!ck) System.out.printf("#%d ERROR\n",tc);
			else System.out.printf("#%d %d %d %d %d\n",tc,F[0],F[1],F[2],F[3]);
		}
	}
}
