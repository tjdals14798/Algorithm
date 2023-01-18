package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_13567 {

	static int[] DX = {1, 0, -1, 0};
	static int[] DY = {0, 1, 0, -1};
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), x = 0, y = 0, dir = 1;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			if(st.nextToken().equals("TURN")) {
				dir += st.nextToken().equals("0") ? -1 : 1;
				if(dir < 0) dir = 3;
				if(dir > 3) dir = 0;
			}else {
				int point = Integer.parseInt(st.nextToken());
				x += DX[dir] * point;
				y += DY[dir] * point;
				
				if(x >= m || y >= m || x < 0 || y < 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		System.out.println(y+" "+x);
	}
}
