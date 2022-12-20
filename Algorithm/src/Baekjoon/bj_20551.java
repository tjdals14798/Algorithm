package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class bj_20551 {

//	버블정렬
//	for(int i = 0; i < N; i++) {
//		int max = 0;
//		for(int j = i+1; j < N; j++) {
//			if(nrr[i]>nrr[j]) {
//				max = nrr[i];
//				nrr[i] = nrr[j];
//				nrr[j]= max;
//			}
//		}
//	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

		int[] nrr = new int[N];
		for(int i = 0; i < N; i++) nrr[i] = Integer.parseInt(br.readLine());
		Arrays.sort(nrr);
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			if(!map.containsKey(nrr[i])) map.put(nrr[i], i);
		}
		
		while(M --> 0) {
			int m = Integer.parseInt(br.readLine());
			if(map.containsKey(m)) System.out.println(map.get(m));
			else System.out.println(-1);
		}
//							시간초과		
//		int nrr[] = new int[N], mrr[] = new int[M];
//		
//		for(int i = 0; i < N; i++) nrr[i] = Integer.parseInt(br.readLine());
//		for(int i = 0; i < M; i++) mrr[i] = Integer.parseInt(br.readLine());
//		
//		Arrays.sort(nrr);
//		
//		for(int i = 0; i < M; i++) {
//			boolean ck = false;
//			int idx = 0;
//			for(int j = 0; j < N; j++) {
//				if(mrr[i]==nrr[j]) {
//					ck = true;
//					idx = j;
//					break;
//				}
//			}
//			if(ck) System.out.println(idx);
//			else System.out.println(-1);
//		}
		
	}

}
