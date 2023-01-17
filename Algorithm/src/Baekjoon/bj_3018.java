package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bj_3018 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), E = Integer.parseInt(br.readLine());
		int cnt = 0;
		Map<String, Integer> map = new TreeMap<>();
		while(E --> 0) {
			String arr[] = br.readLine().substring(2).split(" ");
			List<String> list = new ArrayList<>(Arrays.asList(arr));
			if(list.contains("1")) {	//참가
				for(String s : list) map.put(s, map.getOrDefault(s, 0)+1);
				cnt++;
			}else {		//불참
				int max = 0;
				for(String s : list) {
					if(max < map.getOrDefault(s, 0)) max = map.get(s);
				}
				for(String s : list) map.put(s, max);
			}
		}
		for(String s : map.keySet()) {
			int value = map.get(s);
			if(value == cnt) sb.append(s).append("\n");
		}
		System.out.println(sb);
	}

}
