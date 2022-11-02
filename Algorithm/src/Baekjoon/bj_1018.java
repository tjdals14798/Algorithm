package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1018 {
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		
		String board[] = new String[N];
		for(int i = 0; i < N; i++) board[i] = br.readLine();
		
		int sol = Integer.MAX_VALUE;
		for(int i = 0; i < N-7; i++) {
			for(int j = 0; j < M-7; j++) {
				int curSol = getSolution(i,j,board);
				if(sol > curSol) sol = curSol;
			}
		}
		System.out.println(sol);
	}

	private static int getSolution(int startRow, int startCol, String[] board) {
		String org[] = {"WBWBWBWB","BWBWBWBW"};
		int whitesol = 0;
		
		for(int i = 0; i < 8;i++) {
			int row = startRow +i;
			for(int j = 0; j < 8; j++) {
				int col = startCol + j;
				if(board[row].charAt(col) != org[row % 2].charAt(j)) whitesol++;
			}
		}
		
		return Math.min(whitesol, 64-whitesol);
	}

}