package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_6719 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt(), K = sc.nextInt(), arr[] = new int[N];
			double res = 0.0;
			
			for(int i =0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			for(int i =N-K;i<N;i++) {
				res=(res+arr[i])/2;
			}
			System.out.printf("#%d %f\n",tc,res);
		}
	}

}
