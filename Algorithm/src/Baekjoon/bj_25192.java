package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj_25192 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		HashSet<String> set = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			if(str.equals("ENTER")) {
				sum += set.size();
				set.clear();
			}else {
				set.add(str);
			}
		}
		System.out.println(sum+set.size());
	}

}
