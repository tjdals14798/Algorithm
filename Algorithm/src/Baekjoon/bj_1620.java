package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj_1620 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> hs = new HashMap<String, Integer>();
		String po[]=new String[N+1];
		
		for(int i = 1; i < po.length; i++) {
			String nm = br.readLine();
			hs.put(nm, i);
			po[i] = nm;
		}
		
		while(M --> 0) {
			String find = br.readLine();
			
			if(isNum(find)) {
				int idx = Integer.parseInt(find);
				sb.append(po[idx]);
			}else sb.append(hs.get(find));
			sb.append("\n");
		}
		
		System.out.println(sb);
//		String po[] = new String[N+1], an[] = new String[M+1];
//		
//		for(int i = 1; i < po.length; i++) po[i]=br.readLine();
//		for(int i = 1; i < an.length; i++) an[i]=br.readLine();
//		
//		for(int i = 1; i < an.length; i++) {
//			for(int j = 1; j < po.length; j++) {
//				System.out.println(an[i]+" "+po[j]);
//				if(an[i].equals(po[j])) {
//					System.out.println(j);
//					break;
//				}
//				else if(an[i].equals(Integer.toString(j))) {
//					System.out.println(po[j]);
//					break;
//				}
//			}
//		}
	}
	public static boolean isNum(String s) {
		try {
			Double.parseDouble(s);
			return true;
		}catch (NumberFormatException e) {
			return false;
		}
	}

}
