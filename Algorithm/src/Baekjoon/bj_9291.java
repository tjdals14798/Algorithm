package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class bj_9291 {
	static Set<Integer> set ;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[9][9];

		for(int cnt = 1; cnt <= n; cnt++) {
			
			for(int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < 9; j++){
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			boolean ck = rowck(arr);
			
			if(ck) ck = colck(arr);
			if(ck) ck = boxck(arr);
			
			if(ck) {
				sb.append("Case ").append(cnt).append(": CORRECT").append("\n");
			}else {
				sb.append("Case ").append(cnt).append(": INCORRECT").append("\n");				
			}
			
			br.readLine();
		}
		System.out.println(sb);	
	}
	
	public static boolean rowck(int arr[][]) {
		for(int i = 0; i < 9; i++) {
			set = new HashSet<>();
			for(int j = 0; j < 9; j++){
				set.add(arr[i][j]);
			}
			if(set.size() != 9) return false;
		}
		return true;
	}
	
	public static boolean colck(int arr[][]) {
		for(int i = 0; i < 9; i++) {
			set = new HashSet<>();
			for(int j = 0; j < 9; j++){
				set.add(arr[j][i]);
			}
			if(set.size() != 9) return false;
		}
		return true;
		}
	
	public static boolean boxck(int arr[][]) {
		for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                set = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        set.add(arr[k + (i * 3)][l + (j * 3)]);
                    }
                }
                if(set.size() != 9) return false;
            }
		}
		return true;
	}

}
