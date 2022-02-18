package SW_EA;

import java.util.Scanner;

public class SW_1974 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean ck = true;
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int arr[][]=new int[9][9];
			
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			//За
			for(int i=0;i<9;i++) {
				int hrr[]=new int[9];
				for(int j=0;j<9;j++) {
					hrr[(arr[i][j])-1]++;
				}
				for(int j=0;j<9;j++) {
					if(hrr[j]==0) {
						ck=false;
						break;
					}
				}
			}
			
			//ї­
			for(int i=0;i<9;i++) {
				int hrr[]=new int[9];
				for(int j=0;j<9;j++) {
					hrr[(arr[j][i])-1]++;
				}
				for(int j=0;j<9;j++) {
					if(hrr[j]==0) {
						ck=false;
						break;
					}
				}
			}
			
			//3*3
			for(int i=0;i<=6;i+=3) {
				for(int j=0;j<=6;j+=3) {
					int hrr[] = new int[9];
					int a=i+3;
					int b=j+3;
					
					for(int u=i;u<a;u++) {
						for(int h=j;h<b;h++) {
							hrr[(arr[u][h])-1]++;
						}
					}
					
					for(int u=0;u<9;u++) {
						if(hrr[u]==0) {
							ck=false;
							break;
						}
					}
					
				}
			}
			
			if(ck==true) System.out.printf("#%d %d",tc,1);
			else System.out.printf("#%d %d",tc,0);
			
		}

	}

}
