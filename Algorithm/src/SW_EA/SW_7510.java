package SW_EA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_7510 {
	static int res,N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1;tc <= T;tc++) {
			res = 0;
			N = Integer.parseInt(br.readLine());
			
			for(int i = 1;i<=N;i++) {
				check(i);
			}
			
			System.out.printf("#%d %d\n",tc,res);
		}
	}
	private static void check(int i) {
		int sum = 0;
		for(int j = i;j<=N;j++) {
			sum+=j;
			if(sum==N) {
				res++;
				break;
			}else if(sum>N) break;
		}
		
	}

}
