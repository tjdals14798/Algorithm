package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class bj_11478 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		
		String len = "";
		for(int i = 0; i < str.length(); i++) {
			len = "";
			for(int j = i; j < str.length(); j++) {
				len += str.substring(j, j+1);
				set.add(len);
			}
		}
		System.out.println(set.size());
	}

}
