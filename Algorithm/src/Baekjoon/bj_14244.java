package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14244 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int cnt = 0, node = 0, leaf = node + 1;
		
		while(cnt < n - 1) {
			if(cnt < m) {
				sb.append(node).append(" ").append(leaf).append("\n");
				cnt++;
				if(cnt == m) {
					node = leaf;
					continue;
				}
				leaf++;
				continue;
			}
			sb.append(node).append(" ").append(++node).append("\n");
			cnt++;
		}
		System.out.println(sb);
	}
}
