package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_25501 {
	
    public static void main(String[] args)throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		String str = br.readLine();
    		System.out.println(isPalindrome(str, 1));
    	}
    	
    }
    
    public static String recursion(String s, int l, int r, int c){
        if(l >= r) return "1 " + c;
        else if (s.charAt(l) != s.charAt(r)) return "0 " + c;
        else return recursion(s, l+1, r-1, c+1);
    }
    
    public static String isPalindrome(String s, int cnt){
        return recursion(s, 0, s.length()-1, cnt);
    }
}