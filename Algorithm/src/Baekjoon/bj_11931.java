package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11931 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N-1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i : arr) System.out.println(i);
	}

}
