package Baekjoon;

import java.util.Scanner;

public class bj_1205 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), score = sc.nextInt(), P = sc.nextInt(), r = 1;
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(N == P && score <= arr[arr.length-1]) {
			System.out.println(-1);
		}else {
			for(int i = 0; i < N; i++) {
				if(score < arr[i]) r++;
				else break;
			}
			System.out.println(r);
		}
	}

}
