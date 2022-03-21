package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_4466 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int tc = 1; tc <= T; tc++) {
        	int N = sc.nextInt(); int K = sc.nextInt();
        	int arr[]=new int[N]; int res = 0;
        	
        	for(int i=0;i<N;i++) {
        		arr[i]=sc.nextInt();
        	}
        	Arrays.sort(arr);
        	for(int i=0,j=arr.length-1;i<K;i++,j--) {
        		res+=arr[j];
        	}
        	System.out.printf("#%d %d\n",tc,res);
        	
        }

	}

}
