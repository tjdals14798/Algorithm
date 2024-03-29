package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class bj_2149 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String key = br.readLine();
		String pw = br.readLine();
		int kl = key.length();
		int row = pw.length()/key.length();
		
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < pw.length(); i+=row) list.add(pw.substring(i,i+row));
		
		char arr[][] = new char[kl][row];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = list.get(i).charAt(j);
			}
		}
		char krr[] = key.toCharArray();
		Arrays.sort(krr);
		int idx = 0;
		while(idx != row) {
			for(int i = 0; i < kl; i++) {
				for(int j = 0; j < kl; j++) {
					if(key.charAt(i) == krr[j]) {
						if(arr[j][idx] == 0) continue;
						sb.append(arr[j][idx]);
						arr[j][idx] = 0;
						break;
					}
				}
			}
			idx++;
		}
		
//		----------------------------------------------------------------------------------------------------------------------
//											평문을 암호문으로

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//			
//		String key = br.readLine();
//		String pw = br.readLine();
//		int kl = key.length();
//		int row = pw.length()/key.length();
//		
//		String str[] = new String[row];	
			
//		for(int i = 0,idx = 0; i < pw.length(); i+=kl,idx++) {
//			str[idx] = pw.substring(i,i+kl);
//		};
//		for(String a : str) System.out.println(a);
//
//		ArrayList<String> list = new ArrayList<>();
//		for(int i = 0; i < kl; i++) {
//			String s = "";
//			for(int j = 0; j < str.length; j++) {
//				s += str[j].charAt(i);
//			}
//			list.add(s);
//		}
//		String krr[] = key.split("");
//		Arrays.sort(krr);
//		for(String a : krr) System.out.println(a);
//		int idx = 0;
//		System.out.println(list);
//		while(idx != kl) {
//			for(int i = 0; i < kl; i++) {
//				if(krr[idx].equals(String.valueOf(key.charAt(i)))) {
//					if(list.get(i).equals(""))continue;
//					sb.append(list.get(i));
//					list.set(i,"");
//					break;
//				}
//			}
//			idx++;
//		}
		
		System.out.println(sb);
	}

}
