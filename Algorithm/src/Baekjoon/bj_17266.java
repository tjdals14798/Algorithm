package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_17266 {
	static int arr[];
	static int N,M;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());;
		arr = new int[M];
		
		for(int i = 0; i < M; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int L = 1, R = N, H = 0; //좌,우 끝/ 가로등의 높이
		while(L <= R) {
			int max = (L+R) / 2;
			System.out.println("max "+max);
			if(light(max)) {
				H = max;
				R = max-1;
			}else {
				L = max +1;
			}
		}
		System.out.println(H);
		
	}
	
	static boolean light(int x) {
		int s = 0;	//0부터 N까지
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] - x <= s) {
				System.out.println("빼기 " + (arr[i] - x));
				System.out.println("s "+s);
				s = arr[i] + x;
			}
			else return false;
		}
		
		return N-s <= 0;
	}

}
