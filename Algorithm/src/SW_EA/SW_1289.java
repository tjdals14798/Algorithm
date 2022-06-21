package SW_EA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_1289 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			String memory = br.readLine();
			
			int a = 0, cnt = 0;
			for(int i = 0; i < memory.length();i++) {
				int b = memory.charAt(i) - '0';
				
				if(b != a ) {
					a = b;
					cnt++;
				}
			}
			
			System.out.printf("#%d %d\n",tc,cnt);
		}

	}

}
