package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_15781 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] n = new int[sc.nextInt()];
		int [] m = new int[sc.nextInt()];
		
		for(int i = 0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		for(int i = 0;i<m.length;i++) {
			m[i]=sc.nextInt();
		}
		
		Arrays.sort(n);
		Arrays.sort(m);
		System.out.println(n[n.length-1]+m[m.length-1]);
	}

}
