package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_1221 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		String arr[]= {"ZRO","ONE","TWO","THR","FOR","FIV","SIX","SVN","EGT","NIN"};
		for(int tc=1;tc<=T;tc++) {
			String s = sc.next();	int index = sc.nextInt();	int res[]=new int[index];
			
			for(int i=0;i<index;i++) {
				String str = sc.next();
				for(int j=0;j<arr.length;j++) {
					if(arr[j].equals(str)) res[i]=j;
				}
			}
			Arrays.sort(res);
			
			System.out.println("#"+tc+" ");
			for(int i=0;i<index;i++) {
				for(int j=0;j<arr.length;j++) {
					if(res[i]==j) System.out.print(arr[j]+" ");
				}
			}
			System.out.println();
		}

	}

}
