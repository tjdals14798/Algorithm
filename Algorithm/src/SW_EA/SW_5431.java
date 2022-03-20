package SW_EA;

import java.util.Scanner;

public class SW_5431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();

		for(int tc=1;tc<=T;tc++) {
			int N = sc.nextInt(); int K = sc.nextInt();
			int arr[]=new int[N]; String str = "";
			
			for(int i=0;i<K;i++) {
				int index = sc.nextInt();
				arr[index-1]=index;
			}
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==0) str+=(i+1)+" ";
			}
			System.out.printf("#%d %s\n",tc,str);
		}

	}

}
