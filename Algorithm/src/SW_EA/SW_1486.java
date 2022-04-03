package SW_EA;

import java.util.Scanner;

public class SW_1486 {

	static int N,B,min;
	static int[] arr,res;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1;tc <= T;tc++) {
			N = sc.nextInt();	B=sc.nextInt();		min = Integer.MAX_VALUE;
			arr = new int[N];	
			
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			
			T(0,0);
			
			System.out.printf("#%d %d\n",tc,min-B);

			
		}
	}
	public static void T(int num,int sum) {
		if(num==N) {
			if(sum>=B)	min = Math.min(min , sum);
			return;
		}
		T(num+1,sum+arr[num]);
		T(num+1,sum);
	}

}
