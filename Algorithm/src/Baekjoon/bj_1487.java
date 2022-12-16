package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj_1487 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr,Comparator.comparingInt((int[] o) -> o[0]));
		
//		int max = 0, idx = 0;
//		for(int i = 0; i < N; i++) {
//			int money = 0;
//			for(int j = i+1; j < N; j++) {
//				if(arr[i][0] < arr[j][0]) {
//					money += (arr[i][0]-arr[i][1]);
//					break;
//				}else {
//					money += (arr[i][0]-arr[i][1]);
//				}
//			}
//			if(max < money) {
//				max = money;
//				idx = i;
//			}
//		}
//		if(max == 0) System.out.println(0);
//		else System.out.println(arr[idx][0]);
		
		 int maxPrice = 0;
	     int maxTotalPrice = 0;

	     for(int i = 0 ; i < N ; i++){
	    	 int total = 0;
	         for(int j = i; j < N ;j++){
	             int benefit = arr[i][0] - arr[j][1];
	             if(benefit > 0) total += benefit;
	         }
	         if(maxTotalPrice < total){
	             maxTotalPrice = total;
	             maxPrice = arr[i][0];
	         }
	     }

	        System.out.println(maxPrice);
	}

}
