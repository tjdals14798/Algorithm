package SW_EA;

import java.util.Scanner;

public class SW_1974 {
//	입력으로 9 X 9 크기의 스도쿠 퍼즐의 숫자들이 주어졌을 때, 위와 같이 겹치는 숫자가 없을 경우, 1을 정답으로 출력하고 그렇지 않을 경우 0 을 출력한다.
//	1. 퍼즐은 모두 숫자로 채워진 상태로 주어진다.
//	2. 입력으로 주어지는 퍼즐의 모든 숫자는 1 이상 9 이하의 정수이다.

//	입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
//	다음 줄부터 각 테스트 케이스가 주어진다.
//	테스트 케이스는 9 x 9 크기의 퍼즐의 데이터이다.
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
			//행
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
			
			//열
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
