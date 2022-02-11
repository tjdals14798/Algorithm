package SW_EA;

import java.util.Scanner;

public class SW_1959 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int N=sc.nextInt(); int M=sc.nextInt();
			
			int []Arr=new int[N]; int []Brr=new int[M];
			
			for(int k=0;k<N;k++) Arr[k]=sc.nextInt();
			for(int k=0;k<M;k++) Brr[k]=sc.nextInt();
			
			int res = 0;
			
			if(N<M){
				for(int j=0;j<M-N+1;j++) {
					int sum = 0;
					for(int n=0;n<N;n++) {
						sum += Arr[n]*Brr[j+n];
					}
					res = Math.max(res,sum);
				}
			}
			
			else if(N>M) {
				for(int j=0;j<N-M+1;j++) {
					int sum = 0;
					for(int n=0;n<M;n++) {
						sum += Brr[n]*Arr[n+j];
					}
					res = Math.max(res,sum);
				}
			}
						
			else {
				int sum=0;
				for(int a=0;a<M;a++) {
					sum=Math.max(res,sum);
				}
			}
			System.out.println("#"+i+" "+res);

		}

	}

}
