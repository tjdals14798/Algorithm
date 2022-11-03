package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//import java.util.ArrayList;

public class bj_2164 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= N; i++) q.add(i);
		
		while(q.size()!=1) {
			q.poll();
			q.add(q.poll());
		}
		System.out.println(q.peek());
//		ArrayList<Integer> arr = new ArrayList<>();
//		
//		for(int i = 1; i <= N; i++) {
//			arr.add(i);
//		}
//		
//		while(arr.size()!=1) {
//			arr.remove(0);	// 맨 위 버리기
//			int top = arr.get(0);
//			arr.remove(0);	// 지우고
//			arr.add(top);	// 맨 아래로
//		}
//		System.out.println(arr.get(0));
	}

}
