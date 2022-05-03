package Baekjoon;

import java.util.Scanner;

public class bj_17202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.next(), n2 = sc.next();
		String str = "";
		
		for(int i = 0;i < n1.length();i++) {
			str+=n1.charAt(i);
			str+=n2.charAt(i);
		}
		
		while(str.length() > 2) {
			String str1 = "";
			for(int i = 0;i < str.length()-1;i++) {
				//int n3 = str.charAt(i)-'0'+str.charAt(i+1)-'0';
				int n3 = Character.getNumericValue(str.charAt(i))+ Character.getNumericValue(str.charAt(i+1));
				str1 += Integer.toString(n3%10);
			}
			str = str1;
		}
		
		System.out.println(str);

	}

}
