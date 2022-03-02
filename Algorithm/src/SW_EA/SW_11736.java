package SW_EA;

import java.util.Scanner;

public class SW_11736 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int arr[] = new int[N];
			int cnt=0;
			
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=1;i<N-1;i++) {
				if((arr[i-1]<arr[i]&&arr[i]<arr[i+1])||(arr[i-1]>arr[i]&&arr[i]>arr[i+1])) cnt++;
			}
			System.out.printf("#%d %d\n",tc,cnt);
		}	
	}

}
