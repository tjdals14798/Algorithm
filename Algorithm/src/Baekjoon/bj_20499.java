package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_20499 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken("/"));
		int D = Integer.parseInt(st.nextToken("/"));
		int A = Integer.parseInt(st.nextToken("/"));
		
		if(K+A<D||D==0) System.out.println("hasu");
		else System.out.println("gosu");
		
	}

}