package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2503 {
	
	static String Num;
	static int YStrike;
	static int YBall;
	static int turn;
	static ArrayList<Integer> list = new ArrayList<>(987);
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(turn = 1; turn <= N; turn++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			Num = st.nextToken();	YStrike = Integer.parseInt(st.nextToken());	YBall = Integer.parseInt(st.nextToken());
			find(Num);
			
		}
		System.out.println(list.size());
	}
	
	static void find(String Num) {
		ArrayList<Integer> tmp = new ArrayList<>();
		
		for(int i = 123; i <= 987; i++) {
			if(!ck(i)) continue;
			
			int strike = 0, ball = 0;
			
			String n = Integer.toString(i);
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 3; k++) {
					if(n.charAt(j) == Num.charAt(k)) {
						if(j == k) {
							strike++;
							continue;
						}
						ball++;
					}
				}
			}
			if(YStrike == strike && YBall == ball) tmp.add(i);
	
		}
		if(turn == 1) list.addAll(tmp);
		else list.retainAll(tmp);
	}
	
	static boolean ck(int i) {
		String num = Integer.toString(i);
		if(num.charAt(0) == num.charAt(1) || num.charAt(0) == num.charAt(2) || num.charAt(1) == num.charAt(2) ) {
			return false;
		}
		if(num.charAt(0)== '0' || num.charAt(1) == '0' || num.charAt(2) == '0' ) {
			return false;
		}
		return true;
	}

}
