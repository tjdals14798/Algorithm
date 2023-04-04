package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class bj_2822 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 1; i <= 8; i++) map.put(i, Integer.parseInt(br.readLine()));
		
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue());
		
		List<Integer> list = new LinkedList<>();
		int cnt = 0, sum = 0;
		
		for(Map.Entry<Integer, Integer> entry : entryList){
			cnt++;
			if(cnt > 3) {
				list.add(entry.getKey());
				sum += entry.getValue();
			}
		}
		Collections.sort(list);
		sb.append(sum).append("\n");
		for(int i = 0; i < 5; i++) sb.append(list.get(i)).append(" ");
		System.out.println(sb);
	}

}
