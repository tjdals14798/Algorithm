package SW_EA;

import java.util.Scanner;

public class SW_7087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();	String arr[] = new String[N];
			int cnt=0;
			
			for(int i=0;i<N;i++){
				arr[i]=sc.next();
			}
			
			for(char i=65;i<=90;i++) {
				boolean ck = false;
				//없으면 종료 해야함
				for(int j=0;j<arr.length;j++) {
					if(i==arr[j].charAt(0)) {
						cnt++;	ck=true;
						break;
					}
				}	
				if(ck==false) break;
			}		
			System.out.printf("#%d %d",tc,cnt);
		}

	}

}
