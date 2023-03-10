package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class bj_2309 {
	static int arr[] = new int[9];
	static int sum = 0;
	static int not1 = 0, not2 = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					not1 = arr[i];
					not2 = arr[j];
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(not1 == arr[i] || not2 == arr[i]) continue;
			System.out.println(arr[i]);
		}
	}

}
