package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_17521 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int day = Integer.parseInt(st.nextToken());
		long money = Integer.parseInt(st.nextToken()), coin = 0;
		int arr[] = new int[day];
				
		for(int i = 0; i < day; i++) arr[i] = Integer.parseInt(br.readLine());

		for(int i = 0; i < day-1; i++) {
//			구매
			if(coin == 0 && arr[i] < arr[i+1]) {
				coin = money / arr[i];
				money -= coin * arr[i];
			}
//			판매
			if(arr[i] > arr[i+1]) {
				money += coin * arr[i];
				coin = 0;
			}
		}
//		마지막날 
		money += coin * arr[day-1];
		
		System.out.println(money);
		
	}

}
