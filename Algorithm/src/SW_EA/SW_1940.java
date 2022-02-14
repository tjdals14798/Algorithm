package SW_EA;

import java.util.Scanner;

public class SW_1940 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int T1 = sc.nextInt();
			int cm = 0;//거리
			int nm = 0;//속력
			
			for(int j=0;j<T1;j++) {
				int S = sc.nextInt();
				if(S!=0) {
					int M = sc.nextInt();
					if(S==1) {
						nm+=M;
					}else if(S==2){
						if(nm<M) nm=0;
						else nm-=M;
					}
				}
				cm+=nm;
			}
			System.out.println("#"+i+" "+cm);
		}

	}

}
