package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj_1059 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int s = Integer.parseInt(br.readLine());
		
		int arr[] = new int[s];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < s; i++) arr[i] = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		// n보다 작은 arr[i]는 패스 arr[i+1]보다 큰수는 패스
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE, max = 0;
		boolean ck = false;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>n) {
				min=Math.min(min, arr[i]);
			}else if(arr[i]<n){
				max=Math.max(max, arr[i]);
			}else {
				ck=true;
				break;
			}
		}
		
		int L = (n-max-1);
		int R = (min-n-1);
		int res = L + R +(L*R);
		if(ck) System.out.println(0);
		else System.out.println(res);
	}

}
