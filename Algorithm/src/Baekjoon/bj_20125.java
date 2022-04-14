package Baekjoon;

import java.util.Scanner;

public class bj_20125 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		char arr[][]=new char[T][T];
		
		for(int i=0;i<T;i++) {
			String str = sc.next();
			for(int j=0;j<T;j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		
		int h_y = 0, h_x=0;
		boolean ck = false;
		for(int i=0;i<T;i++) {
			for(int j=0;j<T;j++) {
				if(arr[i][j]=='*') {
					h_y=i+1;
					h_x=j;
					ck=true;
					break;
				}
			}
			if(ck) break;
		}
		
		System.out.println((h_y+1)+" "+(h_x+1));
		
		int left_A=0;
		for(int i=h_x-1;i>=0;i--) {
			if(arr[h_y][i]=='*') left_A++;
		}
		System.out.print(left_A+" ");
		
		int right_A=0;
		for(int i=h_x+1;i<T;i++) {
			if(arr[h_y][i]=='*') right_A++;
		}
		System.out.print(right_A+" ");
		
		int line=0,line_E=0;
		for(int i=h_y+1;i<T;i++) {
			if(arr[i][h_x]=='*') {
				line++;
				line_E=i;
			}
		}
		System.out.print(line+" ");
		
		int left_L=0;
		for(int i=line_E;i<T;i++) {
			if(arr[i][h_x-1]=='*') left_L++;
		}
		System.out.print(left_L+" ");
		
		int left_R=0;
		for(int i=line_E;i<T;i++) {
			if(arr[i][h_x+1]=='*') left_R++;
		}
		System.out.print(left_R+" ");
	}

}
