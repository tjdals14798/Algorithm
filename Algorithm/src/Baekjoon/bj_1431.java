package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class bj_1431 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
		
		for(int i = 0; i < N; i++) arr[i] = br.readLine();
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() < o2.length()) return -1;
				else if(o1.length() == o2.length()) {
					if(num(o1) == num(o2)) 
						return o1.compareTo(o2);
					else 
						return Integer.compare(num(o1), num(o2));
				}else 
					return 1;
			}		
		});
		for(String a : arr) sb.append(a).append("\n");
		System.out.println(sb);
		
	}
	
	public static int num(String a) {
		int sum = 0;
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) >= '0' && a.charAt(i) <= '9') sum += a.charAt(i)-'0';
		}
		return sum;
	}

}
