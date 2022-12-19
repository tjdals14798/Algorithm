package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2799 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), cnt = 0;
		
		String arr[] = new String[(M*5)+1];
		int res[] = new int[5];
		for(int i = 0; i < arr.length; i++) arr[i] = br.readLine();

		for(int i = 1; i < arr[0].length(); i+=5) {
			for(int j = 1; j < arr.length; j++) {
				if(arr[j].charAt(i)=='#') {
					res[cnt]++;
					cnt = 0;
				}
				else if(arr[j].charAt(i)=='*') cnt++;
			}	
		}
		for(int i : res) System.out.print(i+" ");
	}

}
