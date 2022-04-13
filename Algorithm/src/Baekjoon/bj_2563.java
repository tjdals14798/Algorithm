package Baekjoon;

import java.util.Scanner;

public class bj_2563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		boolean arr[][] = new boolean[100][100];
		int N = sc.nextInt();
		int cnt=0;
			
		for(int i=0;i<N;i++) {
			int Y = sc.nextInt(); int X = sc.nextInt();
			
			for(int q=Y-1;q<Y+9;q++) {
				for(int w=X-1;w<X+9;w++) {
					arr[q][w]=true;
				}
			}
		}
				
			for(int q=0;q<100;q++) {
				for(int w=0;w<100;w++) {
					if(arr[q][w]) cnt++;
				}	
			}		
		System.out.println(cnt);
	}	
}
