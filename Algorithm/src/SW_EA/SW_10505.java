package SW_EA;

import java.util.Scanner;

public class SW_10505 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			int avg=0;
			int cnt=0;
			
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
				avg+=arr[i];
			}
			avg/=N;
			for(int i=0;i<N;i++) {
				if(avg>=arr[i]) {
					cnt++;
				}
			}
				System.out.printf("#%d %d\n",tc,cnt);	
		}

	}

}
