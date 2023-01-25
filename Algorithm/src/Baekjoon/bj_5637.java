package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bj_5637 {

	public static void main(String[] args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int len = 0;
		 String res = "";
		 	
		 	roop : while(true) {
		 		String arr[] = br.readLine().trim().split(" ");
		 		
		 		for(int i = 0; i < arr.length; i++) {
		 			arr[i] = arr[i].replaceAll("[^a-zA-Z-]", " ").trim();
		 			String tmp[] = arr[i].split(" ");
		 			
		 			for(int j = 0; j < tmp.length; j++) {
		 				if(tmp[j].equals("E-N-D")) break roop;
		 				if(tmp[j].length() > len) {
		 					len = tmp[j].length();
		 					res = tmp[j].toLowerCase();
		 				}
		 			}
		 		}
		 	}
		 	System.out.println(res);
		 	
//		 	String maxLenStr = "";
//
//	        Loop:
//	        while (true) {
//	            StringTokenizer st = new StringTokenizer(br.readLine(), " ,;:.!?'\"/()[]*");
//	            while (st.hasMoreTokens()) {
//	                String word = st.nextToken();
//	                if (word.equals("E-N-D")) break Loop;
//
//	                maxLenStr = maxLenStr.length() >= word.length() ? maxLenStr : word;
//	            }
//	        }
//
//	        System.out.println(maxLenStr.toLowerCase());
	}

}
