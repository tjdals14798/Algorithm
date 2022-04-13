package Baekjoon;

import java.util.Scanner;

public class bj_24510 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int max = 0;
		String s = "";
		
		for(int i=0;i<T;i++) {
			String str = sc.next();		
			int cnt = 0;
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='f') s="";
				else if(str.charAt(j)=='w')	s="";
				
				s+=str.charAt(j);
				
				if(s.equals("for")) cnt++;
				else if(s.equals("while")) cnt++;
				
//				for(int j=0;j<s.length()-2;j++){
//	                if(s.charAt(j) == 'f' && s.charAt(j+1) == 'o' && s.charAt(j+2) == 'r') {
//	                        tmp++;
//	                        j+=2;
//	                }
//	                else if(j < s.length()-4 && s.charAt(j) == 'w' && s.charAt(j + 1) == 'h' && s.charAt(j + 2) == 'i' && s.charAt(j + 3) == 'l' && s.charAt(j + 4) == 'e') {
//	                        tmp++;
//	                        j += 4;
//	                }
//	            }
				
			}
			
			max=Math.max(cnt, max);
			
		}
		
		System.out.println(max);

	}

}
