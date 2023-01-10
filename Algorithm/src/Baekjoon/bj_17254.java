package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class bj_17254 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		String arr[][] = new String[m][3];
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) arr[i][j] = st.nextToken();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				 if(o1[1].toString().contentEquals(o2[1].toString()))
					 return o1[0].toString().compareTo(o2[0].toString());
	             else
	            	 return o1[1].toString().compareTo(o2[1].toString());
	            }			
	        });
		
		for(int i = 0; i < m; i++) sb.append(arr[i][2]);
		System.out.println(sb);
	}

}
