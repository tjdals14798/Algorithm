package SW_EA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW_14692 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
         
        int T = Integer.parseInt(br.readLine());
        int round = 1;
        while (T-- >0) {
            int N = Integer.parseInt(br.readLine());
             
            // ´ä Ãâ·Â
            sb.append("#").append(round++).append(" ")
            	.append(N % 2 == 0 ? "Alice" : "Bob")
            	.append("\n");
        }
        System.out.println(sb);
    }
}