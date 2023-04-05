package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_16435 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] <= l) l++;
		}
		System.out.println(l);
	}

}
