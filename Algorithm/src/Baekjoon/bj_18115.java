package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class bj_18115 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		Deque<Integer> de = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int card = 1;
		for(int i = n-1; i >= 0; i--) {
			if(arr[i] == 1) de.add(card);
			else if(arr[i] == 2) {
				int tmp = de.removeLast();
				de.add(card);
				de.add(tmp);
			}else if(arr[i] == 3) {
				de.addFirst(card);
			}
			card++;
		}
		for(int i = 0; i < n; i++) {
			sb.append(de.removeLast()).append(" ");
		}
		System.out.println(sb);
	}

}
