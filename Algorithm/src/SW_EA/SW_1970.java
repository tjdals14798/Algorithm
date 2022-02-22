package SW_EA;

import java.util.Scanner;

public class SW_1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			int N=sc.nextInt();
			int arr[]=new int[8];
			arr[0]=N/50000;
			N%=50000;
			arr[1]=N/10000;
			N%=10000;
			arr[2]=N/5000;
			N%=5000;
			arr[3]=N/1000;
			N%=1000;
			arr[4]=N/500;
			N%=500;
			arr[5]=N/100;
			N%=100;
			arr[6]=N/50;
			N%=50;
			arr[7]=N/10;
			N%=10;
			System.out.printf("#%d\n",tc);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
	}

}
