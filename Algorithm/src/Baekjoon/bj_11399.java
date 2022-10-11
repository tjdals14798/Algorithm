package Baekjoon;

import java.util.Scanner;

public class bj_11399 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0;i < n;i++) {
			int max = 0;
			for(int j = i+1;j < n;j++) {
				if(arr[i]>arr[j]) {
					max=arr[i];
					arr[i]=arr[j];
					arr[j]=max;
				}
			}
		}
		int res = 0;
		int sum = 0;
		for(int i = 0;i<n;i++) {
			res+=arr[i];
			sum+=res;
		}
		System.out.println(sum);
	}

}
