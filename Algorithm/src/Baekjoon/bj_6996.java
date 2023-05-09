package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class bj_6996 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
				
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken(), str2 = st.nextToken();
//			sb.append(str1).append(" & ").append(str2).append(" are ");
//			if(anagrams(str1, str2)) sb.append("anagrams.\n");
//			else sb.append("NOT anagrams.\n");		
			Stack<Character> sk = new Stack<>();
			for(int j = 0; j < str1.length(); j++) sk.push(str1.charAt(j));
			
			for(int j = 0; j < str2.length(); j++) {
				for(int k = 0; k < str2.length(); k++) {
					if(str2.charAt(k) == sk.peek()) {
						sk.pop();
						break;
					}
				}
			}
			sb.append(str1).append(" & ").append(str2).append(" are ");
			if(sk.size() == 0) sb.append("anagrams.\n");
			else sb.append("NOT anagrams.\n");				
		}
		System.out.println(sb);
	}
//	public static boolean anagrams(String s1, String s2) {
//		if(s1.length() != s2.length()) return false;
//		int arr[] = new int[26];
//		for(char c: s1.toCharArray()) arr[c - 'a']++;
//		for(char c: s2.toCharArray()) {
//			arr[c - 'a']--;
//			if(arr[c - 'a'] < 0) return false;
//		}
//		
//		return true;
//	}

}
