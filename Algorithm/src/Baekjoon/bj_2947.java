package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2947 {

	 public static void main(String[] args)throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 StringBuilder sb = new StringBuilder();
	     int[] arr = new int[5];
	     for (int i = 0; i < 5; i++) arr[i] = Integer.parseInt(st.nextToken());
	     
	     for(int j=0;j<5;j++){
	    	 for(int i = 0; i < 4; i++) {
	    		 if(arr[i]>arr[i+1]){
	    			 int tmp = arr[i];
	                 arr[i] = arr[i+1];
	                 arr[i+1] = tmp;
	                 for (int num : arr) sb.append(num).append(" ");         
	                 sb.append("\n");
	             }
	         }
	     }
	     System.out.println(sb);
	 }
}