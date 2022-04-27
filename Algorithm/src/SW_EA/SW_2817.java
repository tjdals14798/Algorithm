package SW_EA;

import java.util.Scanner;

public class SW_2817 {
	
	static int N,K;
	static int arr[];
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1;tc <= T;tc++) {
			N = sc.nextInt();
			K=sc.nextInt();
			
			arr = new int[N];
			for(int i = 0;i < N;i++) arr[i]= sc.nextInt();
			
			solve(0,0);
			
			System.out.printf("#%d %d\n",tc,res);
			
		}

	}
	
	static int res;
	private static void solve(int idx,int sum)	{
		if(sum==K) {
			res++;
			return;
		}
		
		if(sum>K || idx>N-1) return;
		solve(idx+1, sum+arr[idx]);
		solve(idx+1, sum);
	}

}
