package bj_bronze;

import java.util.Scanner;

public class bj_1292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[1001];
		int cnt = 1;
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(cnt==1001) break;
				arr[cnt]=i;
				cnt++;
			}
		}
		
		int sum = 0;
		int A = sc.nextInt(), B = sc.nextInt();
		for(int i=A;i<=B;i++) {
			sum+= arr[i];
		}
		System.out.println(sum);
	}

}
