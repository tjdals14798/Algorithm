package Baekjoon;

import java.util.Scanner;

public class bj_1236 {
	
//	영식이는 직사각형 모양의 성을 가지고 있다. 성의 1층은 몇 명의 경비원에 의해서 보호되고 있다. 영식이는 모든 행과 모든 열에 한 명 이상의 경비원이 있으면 좋겠다고 생각했다.
//	성의 크기와 경비원이 어디있는지 주어졌을 때, 몇 명의 경비원을 최소로 추가해야 영식이를 만족시키는지 구하는 프로그램을 작성하시오.
	
//	첫째 줄에 성의 세로 크기 N과 가로 크기 M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 성의 상태가 주어진다. 성의 상태는 .은 빈칸, X는 경비원이 있는 칸이다.

//	첫째 줄에 추가해야 하는 경비원의 최솟값을 출력한다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int cnt = 0;
		
		boolean res[] = new boolean[N];
		boolean arr[][] = new boolean[N][M];
		
		// arr에 true, false 저장
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				String str = sc.next();
				if(str.equals("X")) {
					arr[i][j]=true;
				}else {
					arr[i][j]=false;
				}	
			}
		}
		
		// 경비원이 있으면 true 없으면 false
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[0].length;j++) {
				if(arr[i][j]==true) {
					res[i]=true;
				}
			}
		}
		
		// 경비원이 없다면 추가해야하는 경비원의 수 ++;
		
		for(int i = 0;i < N;i++) {
			if(res[i]==false) {
				cnt++;
			}
		}
		
		System.out.println(cnt);

	}

}
