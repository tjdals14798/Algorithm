package Baekjoon;

import java.util.Scanner;

public class bj_10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt(),arr[] = new int[N+1];
		
		for(int i=1;i<=N;i++) {
			arr[i]=i;
		}
		
		for(int z=0;z<M;z++) {
			int i = sc.nextInt(), j = sc.nextInt();
			int cgi = arr[i], cgj = arr[j];
			
			arr[i]=cgj;
			arr[j]=cgi;
		}
		
		for(int i=1;i<=N;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
