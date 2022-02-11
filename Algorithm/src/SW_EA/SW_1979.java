package SW_EA;

import java.util.Scanner;

public class SW_1979 {
//	N X N 크기의 단어 퍼즐을 만들려고 한다. 입력으로 단어 퍼즐의 모양이 주어진다.
//	주어진 퍼즐 모양에서 특정 길이 K를 갖는 단어가 들어갈 수 있는 자리의 수를 출력하는 프로그램을 작성하라.
	
//	1. N은 5 이상 15 이하의 정수이다. (5 ≤ N ≤ 15)
//	2. K는 2 이상 N 이하의 정수이다. (2 ≤ K ≤ N)

//	입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다.
//	다음 줄부터 각 테스트 케이스가 주어진다.
//	테스트 케이스의 첫 번째 줄에는 단어 퍼즐의 가로, 세로 길이 N 과, 단어의 길이 K 가 주어진다.
//	테스트 케이스의 두 번째 줄부터 퍼즐의 모양이 2차원 정보로 주어진다.
//	퍼즐의 각 셀 중, 흰색 부분은 1, 검은색 부분은 0 으로 주어진다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt(); int K=sc.nextInt();
			int arr[][] = new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++){
					arr[i][j]=sc.nextInt();
				}
			}
			
			int res=0;
			//가로
			for(int i=0;i<N;i++) {
				int cnt = 0;
				for(int j=0;j<N;j++){
					if(arr[i][j]==1)cnt++; 
					else {
						if(cnt==K) res++;
						cnt=0;
					}
				}
				if(cnt==K) res++;				
			}
			//세로
			for(int i=0;i<N;i++) {
				int cnt = 0;
				for(int j=0;j<N;j++){
					if(arr[j][i]==1)cnt++;
					else {
						if(cnt==K) res++;
						cnt=0;
					}
				}
				if(cnt==K) res++;
			}
			System.out.println("#"+tc+" "+res);
		}
	}

}
