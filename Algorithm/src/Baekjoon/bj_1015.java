package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class bj_1015 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		for(int i = 0; i < n; i++) map.put(i, Integer.parseInt(st.nextToken()));
		Map <Integer,Integer> sortMap = sortMapByKey(map);
		
		for(int i = 0; i < map.size(); i++) {
			int num = map.get(i);
			int k = getKey(sortMap,num);
			sb.append(k+" ");
			sortMap.remove(k);
		}
		System.out.println(sb);
//		1
	}
	
	public static <K, V> K getKey(Map<K, V> map, V value) {		 
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

	public static LinkedHashMap<Integer, Integer> sortMapByKey(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

        LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();
        int idx = 0;
        for (Entry<Integer, Integer> entry : entries) {
            result.put(idx++, entry.getValue());
        }
        return result;
    }
}
