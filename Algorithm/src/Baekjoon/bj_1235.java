package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class bj_1235 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int N = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<>();
		
		String arr[] = new String[N];
		for(int i = 0 ; i < N; i++) arr[i] = br.readLine();
		int idx = arr[0].length();
		
		for(int i = 1 ; i <= idx; i++) {
			
			for(int j = 0 ; j < N; j++) set.add(arr[j].substring(idx-i));
			
			if(set.size()==N) {
				System.out.println(i);
				break;
			}
			set.clear();
		}
	}

}
