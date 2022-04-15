package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_11656 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String arr[] = new String[str.length()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=str;
			str=str.replaceFirst(str.charAt(0)+"", "");
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
