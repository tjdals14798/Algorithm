package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class bj_11279 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int t = 0; t < n; t++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) sb.append(q.size() == 0 ? 0 : q.poll()).append("\n");
			else q.add(num);
			
		}
		System.out.println(sb);
	}

}
