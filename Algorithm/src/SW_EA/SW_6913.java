package SW_EA;

import java.util.Scanner;

public class SW_6913 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt(); int M = sc.nextInt();
			int arr[] = new int[M];
			int pcnt=0; int max=0;
			
			for(int j=0;j<N;j++) {
				int cnt=0;
				
				for(int i=0;i<arr.length;i++) {
					arr[i]=sc.nextInt();
					if(arr[i]==1) {
						cnt++;
					}					
				}
				if(max<Math.max(max, cnt)) pcnt=0;
				max = Math.max(max, cnt);
				if(max<=cnt) pcnt++;
				
			}
			System.out.printf("#%d %d %d\n",tc,pcnt,max);
		}

	}

}
