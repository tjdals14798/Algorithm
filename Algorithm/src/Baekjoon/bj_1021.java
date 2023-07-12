package Baekjoon;

import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class bj_1021 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		LinkedList<Integer> deque = new LinkedList<>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;
		
		for(int i = 1; i <= N; i++) deque.add(i);
		
		int arr[] = new int[M];

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) arr[i] = Integer.parseInt(st.nextToken());

		for(int i = 0; i < M; i++) {
			int idx = deque.indexOf(arr[i]);
			int hidx;
			
			if(deque.size() % 2 == 0) hidx = deque.size() / 2 - 1;
			else hidx = deque.size() / 2;
			
			if(idx <= hidx) { //중간보다 앞이거나 같다면 앞으로
				for(int j = 0; j < idx; j++) {
					int temp = deque.pollFirst();
					deque.offerLast(temp);
					cnt++;
				}
			}else {
				for(int j = 0; j < deque.size() - idx; j++) {
					int temp = deque.pollLast();
					deque.offerFirst(temp);
					cnt++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(cnt);
	}

}
