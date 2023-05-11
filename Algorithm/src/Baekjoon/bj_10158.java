package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_10158 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		
		x = w - Math.abs(w - (x + n) % (w * 2));
		y = h - Math.abs(h - (y + n) % (h * 2));
		
//				�ð��ʰ�
//		int tx = n % (w*2);
//		boolean ck = false;
//		for(int i = 0; i < tx; i++) {
//			if(!ck) x++;
//			else x--;
//			if(x == w) ck = true;
//			else if(x == 0) ck = false;
//		}
//		
//		int ty = n % (h*2);
//		ck = false;
//		for(int i = 0; i < ty; i++) {
//			if(!ck) y++;
//			else y--;
//			if(y == h) ck = true;
//			else if(y == 0) ck = false;
//		}
		
//				�ð��ʰ�	
//		if(((x + n) / w) % 2 == 0) x = (x + n) % w;
//		else x = w - (x + n) % w;
//		
//		if(((y + n) / h) % 2 == 0) y = (y + n) % h;
//		else y = h - (y + n) % h;
		
		System.out.println(x+" "+y);
		
	}

}
