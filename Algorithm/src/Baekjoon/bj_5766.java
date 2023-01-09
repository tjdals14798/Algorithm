package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class bj_5766 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
			if(N == 0 && M == 0) break;
			
			Map<Integer, Integer> map = new HashMap<>();
			
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < M; j++) {
					int num = Integer.parseInt(st.nextToken());
					map.put(num, map.getOrDefault(num, 0)+1);
				}
			}
			int grf = Collections.max(map.values()), max = 0;
			List<Integer> list = new ArrayList<>(map.keySet());
			Collections.sort(list);
			for(int t : map.keySet()) {
				int val = map.get(t);
				if(max < val && val < grf) max = val;
			}		
			
			for(int t : list) {
				if(map.get(t) == max) sb.append(t+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}