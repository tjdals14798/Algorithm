package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bj_1337 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int cnt = 0; cnt < n; cnt++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.size(); i++) {
			int num = arr.get(i), cnt = 0; 
			for(int j = 1; j < 5; j++) {
				if(arr.contains(num+j)) continue;
				else cnt++;
			}
			min = Integer.min(min, cnt);
		}
		
		System.out.println(min);
	}

}
