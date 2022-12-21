package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9322 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int cnt = 0; cnt < N; cnt++) {
			int n = Integer.parseInt(br.readLine());
			String arr[][] = new String[4][n];
			for(int i = 0; i < 3; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					arr[i][j] = st.nextToken();
				}
			}

			for(int i = 0; i < n;i++) arr[3][find(arr[0],arr[1][i])] = arr[2][i];
			
			for(int i = 0; i < n;i++) System.out.print(arr[3][i]+" ");
		}
	}
	
	public static int find(String[] arr, String target) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i].equals(target)) return i;
	    }
	    return -1;
	}
	

}
