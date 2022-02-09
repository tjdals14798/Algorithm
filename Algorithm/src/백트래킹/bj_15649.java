package 백트래킹;

import java.util.Scanner;

public class bj_15649 {

	public static boolean[] barr; 
	public static int[] arr; 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new int[M];
		barr = new boolean[N];
		back(N,M,0);
		
	}

	public static void back(int N,int M, int cnt) {
		if(cnt==M) {
			for(int val:arr) {
				System.out.print(val+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0;i<N;i++) {
			if(!barr[i]) {
				barr[i]=true;
				arr[cnt]=i+1;
				back(N,M,cnt+1);
				barr[i]=false;
			}
		}
	}
	
}
