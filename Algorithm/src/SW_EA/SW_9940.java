package SW_EA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW_9940 {

	public static void main(String[] args) throws NullPointerException,IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()); 
		
		for(int tc=1;tc<=T;tc++) {
			int N = Integer.parseInt(br.readLine());
			boolean brr[]=new boolean[N+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
            
            boolean check = true;
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                if(num > N || brr[num]) {
                    check = false;
                    break;
                }
                brr[num] = true;
            }		
			System.out.printf("#%d %s\n",tc,(check?"Yes":"No"));
		}

	}

}
