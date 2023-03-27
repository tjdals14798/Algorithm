package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class bj_7785 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			map.put(st.nextToken(), st.nextToken());
		}
		List<String> list = new ArrayList<String>();
		
		for (Entry<String, String> entry : map.entrySet()) {
			if(entry.getValue().equals("enter")) list.add(entry.getKey());
		}
		Collections.sort(list,Collections.reverseOrder());
		for(var li : list) {
			System.out.println(li);
		}
		
	}

}
