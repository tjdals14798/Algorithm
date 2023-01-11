package Baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class bj_5648 {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb;
		int n = sc.nextInt();
		String srr[] = new String[n];
		for(int i = 0; i < n; i++) {
			sb = new StringBuffer(sc.next());
			srr[i] = sb.reverse().toString();
		}
		
		Long arr[] = new Long[n];
		for(int i = 0; i < n; i++) arr[i] = Long.parseLong(srr[i]);
		
		Arrays.sort(arr);
		
		for(Long i : arr) System.out.println(i);
	}

}
