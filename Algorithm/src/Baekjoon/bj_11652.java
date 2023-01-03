package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class bj_11652 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Map<Long, Integer> map = new HashMap<>();
		for(int cnt = 0; cnt < n; cnt++) {			
			Long key = Long.parseLong(br.readLine());
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		int max = 0;
		ArrayList<Integer> arr = new ArrayList<>(map.values());
		for(Integer val : arr) {
			if(max<val) max = val;
		}
		PriorityQueue<Long> q = new PriorityQueue<>();
		for(Long key : map.keySet()) {
			if(max == map.get(key)) q.add(key);
		}
		System.out.println(q.poll());
	}

}
