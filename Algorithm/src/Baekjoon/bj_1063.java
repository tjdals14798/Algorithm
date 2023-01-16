package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1063 {
	static char[] ston, king;

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		king = st.nextToken().toCharArray(); ston = st.nextToken().toCharArray();
		int n = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			char Nk[] = move(str,king);
			if(ck(Nk)) {
				if(Nk[0]==ston[0] && Nk[1] == ston[1]) {
					char Ns[] = move(str, ston);
					if(ck(Ns)) {
						king = Nk;
						ston = Ns;
					}else continue;
				}else king = Nk;	
			}else continue;
		}
		sb.append(king[0]).append(king[1]).append("\n").append(ston[0]).append(ston[1]);
		System.out.println(sb);
		
	}
	
	public static boolean ck(char[] ck) {
		if(ck[0] < 'A' || ck[0] > 'H' || ck[1] < '1' || ck[1] > '8') return false;
		else return true;
	}
	
	public static char[] move(String point, char[] target) {
		char res[] = target.clone(); 
		switch (point) {
		case "R":
			res[0]++;
			break;
		case "L":
			res[0]--;
			break;
		case "B":
			res[1]--;
			break;
		case "T":
			res[1]++;
			break;
		case "RT":
			res[0]++;
			res[1]++;
			break;
		case "LT":
			res[0]--;
			res[1]++;
			break;
		case "RB":
			res[0]++;
			res[1]--;
			break;
		case "LB":
			res[0]--;
			res[1]--;
			break;
		}
		return res;
	}

}
