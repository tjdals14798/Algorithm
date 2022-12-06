package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_11508 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer arr[] = new Integer[N];
		
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(arr, Comparator.reverseOrder());	//배열 내림차순 정렬
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			if(i % 3 == 2)continue;	//2+1 제외
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
