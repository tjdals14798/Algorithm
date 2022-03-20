package SW_EA;

import java.util.Scanner;

public class SW_3456 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int T = sc.nextInt();

		for(int tc=1;tc<=T;tc++) {
			int arr[]=new int[3];
			int index=0;
			
			for(int i=0;i<3;i++) {
				arr[i]=sc.nextInt();
			}
			
			if(arr[0]==arr[1]) index=arr[2];
			else if(arr[0]==arr[2]) index=arr[1];
			else if(arr[1]==arr[2]) index=arr[0];
			
			System.out.printf("#%d %d\n",tc,index);
		}
	}

}
