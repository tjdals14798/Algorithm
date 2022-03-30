package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_1860 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		
		for(int tc=1;tc<=T;tc++) {
			//	N = »ç¶÷,		M,K = ÃÊ´çºØ¾î»§
			int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
			int arr[]=new int[N]; boolean ck = false;
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++) {
				if(arr[i]/M*K<=i) {
					ck = true;
					break;
				}				
			}
			
			if(ck) System.out.printf("#%d %s\n",tc,"Impossible");
			else System.out.printf("#%d %s\n",tc,"Possible");
		}

	}

}
