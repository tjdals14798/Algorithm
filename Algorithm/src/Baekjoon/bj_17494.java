package Baekjoon;

import java.util.Scanner;

public class bj_17494 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int arr[][]=new int [N][2];
		int min=Integer.MAX_VALUE,res=0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if(arr[i][0]+arr[j][0]>=M) {
					int pls = arr[i][1]+arr[j][1];
					int abs = Math.abs(pls-M);
					if(abs<min) {
						min = abs;
						res = pls;
					}
				}
			}
		}	
		if(res==0) System.out.println("ÁË¼ÛÇÕ´Ï´Ù ÇÑ½Â¿± º´Àå´Ô");
		else System.out.println(res);		
	}

}
