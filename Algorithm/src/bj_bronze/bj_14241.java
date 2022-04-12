package bj_bronze;

import java.util.Arrays;
import java.util.Scanner;

public class bj_14241 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), arr[]=new int[T];

		for(int i=0;i<T;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = arr[0]+arr[1];
		int res = arr[0]*arr[1];
		
		for(int i=2;i<T;i++) {
			res+=sum*arr[i];
			sum=sum+arr[i];
		}
		
		System.out.println(res);

	}

}
