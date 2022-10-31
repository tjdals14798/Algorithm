package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class bj_10845 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), last = 0;
		Queue<Integer> qu = new LinkedList<>();
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch (str) {
			case "pop":
				if(qu.isEmpty()) System.out.println(-1); 
				else System.out.println(qu.poll());
				break;
			
			case "push":
				int t = Integer.parseInt(st.nextToken());
				last = t;
				qu.offer(t);
				break;
				
			case "size":
				System.out.println(qu.size());
				break;
				
			case "empty":
				if(qu.isEmpty()) System.out.println(1);
				else System.out.println(0);
				break;
				
			case "front":
				if(qu.isEmpty()) System.out.println(-1);
				else System.out.println(qu.peek());
				break;
				
			case "back":
				if(qu.isEmpty()) System.out.println(-1);
				else System.out.println(last);
				break;
				
			}
			
		}
	}

}
