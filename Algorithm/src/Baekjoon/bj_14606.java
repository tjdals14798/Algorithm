package Baekjoon;

import java.util.Scanner;

public class bj_14606 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int arr[] = new int[10];
		arr[0]=0;arr[1]=1;
		
		for(int i=2;i<10;i++) {
			arr[i]=(arr[i-1])+i;
		}
		System.out.println(arr[T-1]);
	}


}
