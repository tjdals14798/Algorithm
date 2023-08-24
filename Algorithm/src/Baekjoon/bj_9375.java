package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj_9375 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int cnt = 0; cnt < T; cnt++) {
			HashMap<String, Integer> map = new HashMap<>();
			int n = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				String name = st.nextToken(), type = st.nextToken();
				map.put(type, map.getOrDefault(type, 0) + 1);
			}
			
			int res = 1;
			for(int num : map.values()) res *= num + 1;
			
			System.out.println(res - 1);
		}
	}

}
