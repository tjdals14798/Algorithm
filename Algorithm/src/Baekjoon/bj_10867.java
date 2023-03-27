package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class bj_10867 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i = 0; i < n; i++) set.add(Integer.parseInt(st.nextToken()));
		for(int a : set) sb.append(a).append(" ");
		
		System.out.println(sb);
	}

}
