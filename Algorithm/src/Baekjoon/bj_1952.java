package Baekjoon;

import java.util.Scanner;

public class bj_1952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int moveX[] = {0,1,0,-1}, moveY[] = {-1,0,1,0};
		int M = sc.nextInt(), N = sc.nextInt();
		boolean arr[][] = new boolean[M][N];
		
		int x = 0, y = 0, cr = 1, cnt = 0;
		
		while(true) {
			if(arr[y][x]) break;
			
			arr[y][x] = true;
			int nextX = x + moveX[cr];
			int nextY = y + moveY[cr];
			//	X가 0보다 작거나, N보다 크거나 같을때 Y가 보다 작거나, M보다 크거나 같을때, arr[y][x]가 true일때  = 방향전환
			if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= M || arr[nextY][nextX]) {
				if(cr == 3) cr = 0;
				else cr++;
				cnt++;
			}
			x += moveX[cr];
			y += moveY[cr];
		}
		System.out.println(cnt-1);
	}
}
