package Baekjoon;

import java.util.Scanner;

public class bj_3181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String B[]= {"i","pa","te","ni","niti","a","ali","nego","no","ili"};
		String str = sc.nextLine();
		System.out.println(str);
		String arr[]=str.split(" ");
		String res = "";
		
		for(int i=0;i<arr.length;i++) {
			boolean ck = true;
			for(int j=0;j<B.length;j++) {
				if(arr[i].equals(B[j])) {
					if(i==0)	continue;
					ck=false;
				}
			}
			if(ck) {
				res += arr[i].charAt(0);
			}
		}
		System.out.println(res.toUpperCase());

	}

}
