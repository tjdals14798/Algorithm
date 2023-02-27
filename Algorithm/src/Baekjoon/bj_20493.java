package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_20493 {

	static int x[] = {1, 0, -1, 0};
	static int y[] = {0, -1, 0, 1};
	static int point, ckpoint, cR, cC, idx;
	static String str;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());

		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			//	이동거리 계산
			point = Integer.parseInt(st.nextToken());
			ckpoint = point - ckpoint;	// A에서 B를 이동한 시간
			cR = cR + x[idx] * ckpoint;
			cC = cC + y[idx] * ckpoint;
			str = st.nextToken();
			
			//	방향설정
			if(str.equals("right")) idx = (idx+1) % 4;
			else idx = (idx +3) % 4;
			ckpoint = point;
		}
		//	마지막 직진구간
		ckpoint = t - point;
		cR = cR + x[idx] * ckpoint;
		cC = cC + y[idx] * ckpoint;
		System.out.println(cR + " " + cC);
	}

}
