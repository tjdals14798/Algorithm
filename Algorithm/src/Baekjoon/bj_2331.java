package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class bj_2331 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(a);
		
		while(true) {
			int tmp = arr.get(arr.size() - 1);
			int res = 0;
			
			while(tmp != 0) {
				res += Math.pow(tmp % 10, b);
				tmp /= 10;
			}
			
			if(arr.contains(res)) {
				int ans = arr.indexOf(res);
				System.out.println(ans);
				break;
			}
			arr.add(res);
		}

	}

}
