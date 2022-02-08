package SW_EA;

import java.util.Base64;
import java.util.Scanner;

public class SW_1928 {
//	입력으로 Base64 Encoding 된 String 이 주어졌을 때, 해당 String 을 Decoding 하여, 원문을 출력하는 프로그램을 작성하시오.

//	문자열의 길이는 항상 4의 배수로 주어진다. 그리고 문자열의 길이는 100000을 넘지 않는다.

//	입력은 첫 줄에 총 테스트 케이스의 개수 T가 온다. 다음 줄부터 각 테스트 케이스가 주어진다.
//	테스트 케이스는 Encoding 된 상태로 주어지는 문자열이다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			String N = sc.next();
			String V = new String(Base64.getDecoder().decode(N));
			System.out.println("#"+i+" "+V);
		}
	}
}
