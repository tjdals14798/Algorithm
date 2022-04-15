package Baekjoon;

import java.util.Scanner;

public class bj_11292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			String arr[][]=new String[N][2];
			double max = 0;
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=sc.next();
				}
			}
			
			for(int i=0;i<N;i++) {
				if(max<Double.parseDouble(arr[i][1])) max=Double.parseDouble(arr[i][1]);
			}
			
			for(int i=0;i<N;i++) {
				if(max==Double.parseDouble(arr[i][1])) System.out.print(arr[i][0]+" ");
			}
			System.out.println();
			if(N==0) break;
		}
	}

}
