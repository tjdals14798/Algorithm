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
			//	X�� 0���� �۰ų�, N���� ũ�ų� ������ Y�� ���� �۰ų�, M���� ũ�ų� ������, arr[y][x]�� true�϶�  = ������ȯ
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
