package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_7829 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int tc = 1;tc <= T;tc++) {
			int n = sc.nextInt();	int arr[] = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			System.out.printf("#%d %d\n",tc,arr[0]*arr[arr.length-1]);
		}
	}

}
