package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class bj_4134 {	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < cnt; t++) {
			long n = Long.parseLong(br.readLine());
			var big = new BigInteger(String.valueOf(n));
			
			if(big.isProbablePrime(10)) {
				System.out.println(n);
			}else {
				System.out.println(big.nextProbablePrime());
			}
		}
	}
}
