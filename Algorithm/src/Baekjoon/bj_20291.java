package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class bj_20291 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
//		Map<String, Integer> map = new HashMap<>();
//		
//		for(int i = 0; i < n; i++) {
//			String arr[] = br.readLine().split("[.]");
//			map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
//		}
//		List<String> list = new ArrayList<>(map.keySet());
//		list.sort((s1,s2) -> s1.compareTo(s2));
//		for(String a : list) {
//			sb.append(a).append(" ").append(map.get(a)).append("\n");
//		}
		
		Map<String, Integer> map = new TreeMap<>();
		for(int i = 0; i < n; i++) {
			String arr[] = br.readLine().split("[.]");
			map.put(arr[1], map.getOrDefault(arr[1], 0)+1);
		}
		for(Entry<String, Integer> m: map.entrySet()) {
			sb.append(m.getKey()).append(" ").append(m.getValue()).append("\n");
		}
		System.out.println(sb);
	}

}
