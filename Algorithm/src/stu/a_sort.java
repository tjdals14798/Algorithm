package stu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a_sort {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr[];
		
		for(int t = 0; t < n; t++) {
			st = new StringTokenizer(br.readLine());
			arr = new int[st.countTokens()];
			
			for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(st.nextToken());
		
			for(int i = 0; i < arr.length; i++) {
				for(int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			for(int i = 0; i < arr.length; i++) sb.append(arr[i]).append(" ");
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
