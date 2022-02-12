package bj_bronze;

import java.util.Scanner;

public class bj_20112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		char arr[][]=new char[N][N];
		String srr[]=new String[N];
		
		for(int i=0;i<N;i++) {
			srr[i]=sc.next();
			for(int j=0;j<N;j++) {
				arr[i][j]=srr[i].charAt(j);
			}
		}
		
		String A="";
		String B="";
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				A+=arr[i][j];
				B+=arr[j][i];
			}
		}
		
		if(A.equals(B)) System.out.println("YES");
		else System.out.println("NO");
	}

}
