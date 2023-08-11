package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_12782 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int cnt0 = 0, cnt1 = 0;
            
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken(), b = st.nextToken();
            
            for(int k = 0; k < a.length(); k++) {
                if(a.charAt(k) != b.charAt(k)) {
                    if(a.charAt(k) == '1') cnt0++;
                    else cnt1++;
                }
            }
            
            if(cnt0 >= cnt1) sb.append(cnt0); 
            else sb.append(cnt1);     
            
            sb.append("\n");     
        }
        System.out.println(sb);
	}
}