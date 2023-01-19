package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class bj_1822 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
		TreeSet<Long> set = new TreeSet<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < A; i ++) set.add(Long.parseLong(st.nextToken()));
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < B; i ++) set.remove(Long.parseLong(st.nextToken()));
		
		for(Long a : set) sb.append(a).append(" ");
		System.out.println(set.size()+"\n"+sb);
		
	}

}
