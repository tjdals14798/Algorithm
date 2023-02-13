package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1049 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		int pack = 1000, one = 1000;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			pack = Integer.min(pack, Integer.parseInt(st.nextToken()));
			one = Integer.min(one, Integer.parseInt(st.nextToken()));
		}
		
		int res = 0;
		res = Math.min(((N / 6) + 1) * pack, one * N);	// °¡Àå ½Ñ pack °¡°Ý vs °¡Àå ½Ñ one °¡°Ý
		res = Math.min(res, (N / 6) * pack + (N % 6) * one);	// (°¡Àå ½Ñ pack °¡°Ý vs °¡Àå ½Ñ one °¡°Ý) vs (°¡Àå ½Ñ pack + °¡Àå ½Ñ one °¡°Ý)

		System.out.println(res);
		
//		while(N > 0) {
//			if(N < pack) {
//				int sum = one * N;
//				if(sum > pack) {
//					res += pack;
//					N -= 6;
//				}
//				else {
//					res += sum;
//					N -= N;
//				}
//			}else {
//				int n = N / 6;
//				if(n >= 1) {
//					res += pack * n;
//					N -= 6 * n;
//				}else {
//					res += Math.min(pack, one*N);
//					N = 0;
//				}
//			}
//		}
		
	}

}
