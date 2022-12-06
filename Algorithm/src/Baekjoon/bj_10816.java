package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj_10816 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			map.put(key, map.getOrDefault(key, 0)+1);
			//같은값이 몇개가 있는지 hashmap에 저장 {2=1, 3=2, 6=1, 7=1, -10=2, 10=3}
		}

		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(map.getOrDefault(key, 0)).append(' ');
			//입력된 값을 map.key와 비교 값이 있으면 value 값을 출력하고 아니라면 default 값인 0을 출력한다. 
		}
		System.out.println(sb);
	}

}
