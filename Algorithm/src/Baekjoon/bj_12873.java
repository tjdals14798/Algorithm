package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class bj_12873 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) list.add(i);
		int t = 0;
		
		for(int i = 1; i < n; i++) {
			int out = (t + getNum(i, list.size()) -1 ) % list.size();
			if(out < 0) out += list.size();
			list.remove(t = out);
		}
		System.out.println(list.get(0));
	}
	
	static int getNum(int i, int mod) {
		int ans = i;
		ans *= i;
		ans %= mod;
		ans *= i;
		return ans % mod;
	}

}
