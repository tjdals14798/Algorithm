package SW_EA;

import java.util.Scanner;

public class SW_2005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N =sc.nextInt();
			int arr[][] = new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<=i;j++) {
					if(i==j || j==0) arr[i][j]=1;
					else {
						arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
					}
				}
			}
			System.out.printf("#%d\n",tc);
			for(int i=0;i<N;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
