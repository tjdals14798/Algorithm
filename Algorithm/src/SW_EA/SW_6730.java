package SW_EA;

import java.util.Scanner;

public class SW_6730 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();

		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			int min = 0; int max=0;
			
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i=1;i<N;i++) {
				
				if(arr[i-1]>arr[i]) {
					int a = arr[i-1]-arr[i];
					min = Math.max(min, a);
					
				}else if(arr[i-1]<arr[i]) {
					int a = arr[i]-arr[i-1];
					max = Math.max(max, a);
			
				}
			}
			System.out.printf("#%d %d %d\n",tc,max,min);
		}

	}

}
