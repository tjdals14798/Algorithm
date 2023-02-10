package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class bj_9417 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			int[] arr = Stream.of(str.split(" ")).mapToInt(Integer::parseInt).toArray();
			int max = 0;
			
			for(int j = 0; j < arr.length-1; j++) {
				for(int k = j+1; k <arr.length; k++) {
					max = Math.max(max, getGCD(arr[j], arr[k]));
				}
			}
			System.out.println(max);
		}
	}
	public static int getGCD(int num1, int num2) {
		 if (num1 % num2 == 0) {
	        return num2;
	     }
	     return getGCD(num2, num1%num2);
	 }
}
