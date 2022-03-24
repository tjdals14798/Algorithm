package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_4676 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = null;
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			String str = sc.next(); int N = sc.nextInt();
			sb = new StringBuffer(str); int arr[]=new int[N];
			
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);			
			for(int i=0;i<N;i++) {
				sb.insert(arr[i]+i, "-");
			}
			System.out.printf("#%d %s\n",tc,sb);
		}

	}

}
