package SW_EA;

import java.util.Scanner;

public class SW_2001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int M=sc.nextInt();
			int Max=0;
			
			int Nrr[][]=new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++){
					Nrr[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<N-M+1;i++) {
				for(int j=0;j<N-M+1;j++){
					int sum=0;
					for(int u=0;u<M;u++) {
						for(int h=0;h<M;h++) {
							sum+=Nrr[i+u][j+h];
						}
					}
					if(Max<sum) Max=sum;
				}
			}
			
			System.out.printf("#%d %d\n",tc,Max);
		}

	}

}
