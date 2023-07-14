package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1213 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int arr[] = new int[26];
		
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)-'A']++;
		}
		
		int cen = 0, one = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				cen = i;
				one++;
			}
		}

		if(one > 1 || (one > 0 && str.length() % 2 == 0)){
			System.out.println("I'm Sorry Hansoo");
		}
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]/2; j++){
                sb.append((char)(i+'A'));
            }
        }
		StringBuffer tmp = new StringBuffer(sb.toString());
		if(one ==1)sb.append((char)(cen+'A'));
		System.out.println(sb.toString()+tmp.reverse());
	}

}
