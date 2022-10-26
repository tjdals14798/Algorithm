package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1969 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		String arr[] = new String[n];
		int max = 0, HD = 0;
		
		for(int i = 0; i < n; i++) arr[i]=br.readLine();
		
		for(int i = 0; i < m; i++) {
			int a = 0, c = 0, g = 0, t = 0;
			for(int j = 0; j < n; j++) {
				switch(arr[j].charAt(i)) {
				case 'A' : a++; break;
				case 'C' : c++;	break;
				case 'G' : g++;	break;
				case 'T' : t++;	break;
				}
			}
			max = Math.max(a>c? a:c, g>t?g:t);
			HD += (n-max);
			System.out.print(res(a,c,g,t,max));
		}
		System.out.println("\n"+HD);
	}
	
	public static char res(int a,int c,int g,int t,int max) {
		if(max == a) return 'A';
		else if(max == c) return 'C';
		else if(max == g) return 'G';
		else return 'T';
	}
}
