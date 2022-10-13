package Baekjoon;

import java.util.Scanner;

public class bj_1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 while(true) {
			 String str = sc.next();
			 String res = "";
			 if(str.equals("0")) break;
			 
			 for(int i = str.length()-1;i >= 0;i--) {
				 res += str.charAt(i);
			 }
			 System.out.println(str.equals(res)?"yes":"no");
		 }

	}

}
