package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_9996 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), "*");
		String a = st.nextToken();
		String b = st.nextToken();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < t; i++) {
			String s = br.readLine();
			
			if(a.length() + b.length() > s.length()) {
				sb.append("NE").append("\n");
				continue;
			}
			String c = s.substring(0, a.length());
			String d = s.substring(s.length() - b.length(), s.length());
				
			if(c.equals(a) && d.equals(d)) sb.append("DA").append("\n");
			else sb.append("NE").append("\n");
			
		}
		System.out.println(sb);
	}

}
