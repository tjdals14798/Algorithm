package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_1208 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	        
	    for (int tc = 1; tc <= 10; tc++) {
	    	int D = sc.nextInt(); int arr[]=new int[100];
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		arr[i]=sc.nextInt();
	    	}
	    	Arrays.sort(arr);
	    	for(int i=0;i<D;i++) {
	    		arr[arr.length-1]=arr[arr.length-1]-1;
	    		arr[0]=arr[0]+1;
	    		Arrays.sort(arr);
	    	}
	    	System.out.printf("#%d %d\n",tc,arr[arr.length-1]-arr[0]);
	    }

	}

}
