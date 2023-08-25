package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class bj_2910 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken()); 
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		List<Integer> list = new ArrayList<>(map.keySet());
		
		list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
		StringBuilder sb = new StringBuilder();
		for (Integer key : list) {
			for(int i = 0; i < map.get(key); i++) sb.append(key).append(" ");
		}
		System.out.println(sb);
		
	}

}
