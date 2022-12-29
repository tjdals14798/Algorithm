package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class bj_1755 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new LinkedHashMap<>();
		for(int i = m; i <= n; i++) {
			String[] ar = Integer.toString(i).split("");
			if(ar.length == 2)map.put(arr[Integer.parseInt(ar[0])]+arr[Integer.parseInt(ar[1])], i);
			else map.put(arr[Integer.parseInt(ar[0])], i);
		}
		Map<String, Integer> result = sortMapByKey(map);
		int cnt = 0;
		for(String str : result.keySet()) {
			int idx = map.get(str);
			sb.append(idx+" ");
			cnt++;
			if(cnt%10==0)sb.append("\n");
		}
		System.out.println(sb);
	}
	
	 public static LinkedHashMap<String, Integer> sortMapByKey(Map<String, Integer> map) {
	        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
	        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

	        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
	        for (Entry<String, Integer> entry : entries) {
	            result.put(entry.getKey(), entry.getValue());
	        }
	        return result;
	    }

}
