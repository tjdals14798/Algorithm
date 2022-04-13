package Baekjoon;

import java.util.Scanner;

public class bj_17388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int arr[]= new int[3];
		int min=Integer.MAX_VALUE;
		int index=0;
		
		for(int i=0;i<3;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++) {
			sum+=arr[i];
			if(min>arr[i]) {
				min = arr[i];
				index=i;
			}
		}
		
		if(sum>=100) System.out.println("OK");
		else {
			if(index==0) System.out.println("Soongsil");
			else if(index==1) System.out.println("Korea");
			else System.out.println("Hanyang");
		}
	}

}
