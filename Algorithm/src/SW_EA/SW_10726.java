package SW_EA;

import java.util.Scanner;

public class SW_10726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; ++tc) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str = "ON";
            for (int i = 0; i < n; ++i) {
                if (m % 2 == 0) {
                	str = "OFF";
                    break;
                }
                m >>= 1;	//비트 연산자 
            }
            System.out.printf("#%d %s\n", tc, str);
        }

	}

}
