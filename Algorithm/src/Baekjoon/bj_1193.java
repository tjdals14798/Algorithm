package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1193 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int cnt = 1, cnt_sum = 0;
		
		while(true) {
			if(n <= cnt_sum + cnt) {
				if(cnt % 2 == 1) {
					System.out.println((cnt - (n - cnt_sum - 1)) + "/" + (n - cnt_sum)); 
					break;
				}
				else {
					System.out.println((n - cnt_sum) + "/" + (cnt - (n - cnt_sum -1)));
					break;
				}
			}else {
				cnt_sum += cnt;
				cnt++;
			}
		}
	}

}
