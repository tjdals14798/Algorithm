package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_2346 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		LinkedList<int[]> list = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) list.add(new int[] {i+1, Integer.parseInt(st.nextToken())});
		int idx = 0;
		while(list.size() != 1) {
			int move = list.get(idx)[1];
			int size = list.size() - 1;
			
			sb.append(list.get(idx)[0]).append(" ");
			list.remove(idx);
			
			if(move > 0) move--;
			idx = (idx + move) % size;
			if(idx < 0) idx +=size;
		}
		sb.append(list.get(0)[0]);
		System.out.println(sb);
	}

}
