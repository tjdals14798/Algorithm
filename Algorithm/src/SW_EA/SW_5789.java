package SW_EA;

import java.util.Scanner;

public class SW_5789 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt();	int Q = sc.nextInt();
			int arr[]=new int[N];	String str = "";
			
			for(int i=1;i<=Q;i++) {
				int L = sc.nextInt(); int R = sc.nextInt();				
				for(int j=L-1;j<R;j++) arr[j]=i;
			}
			for(int i=0;i<arr.length;i++) {
				str += arr[i]+" ";
			}
			System.out.printf("#%d %s\n",tc,str);
			
		}	
	}

}
