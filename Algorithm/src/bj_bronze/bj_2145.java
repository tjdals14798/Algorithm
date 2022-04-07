package bj_bronze;

import java.util.Scanner;

public class bj_2145 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String str = sc.next();
			String arr[] = new String[str.length()];
			for(int i=0;i<str.length();i++) {
				arr[i]=(str.charAt(i)-'0')+"";
			}
			
			if(str.equals("0")) break;
			next(arr);
		}

	}
	
	public static void next(String arr[]) {
		int res=0;
		
		for(int i=0;i<arr.length;i++) {
			res+=Integer.parseInt(arr[i]);
		}
		
		if(res/10==0) System.out.println(res);
		else next(String.valueOf(res).split(""));
	}

}
