package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class bj_10816 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer,Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			map.put(key, map.getOrDefault(key, 0)+1);
			//�������� ��� �ִ��� hashmap�� ���� {2=1, 3=2, 6=1, 7=1, -10=2, 10=3}
		}

		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			sb.append(map.getOrDefault(key, 0)).append(' ');
			//�Էµ� ���� map.key�� �� ���� ������ value ���� ����ϰ� �ƴ϶�� default ���� 0�� ����Ѵ�. 
		}
		System.out.println(sb);
	}

}
