package SW_EA;

import java.util.Scanner;

public class SW_2050 {
//	문자열의 최대 길이는 200이다.

//	알파벳으로 이루어진 문자열이 주어진다.

//	각 알파벳을 숫자로 변환한 결과값을 빈 칸을 두고 출력한다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String b = sc.next();
		
		for(int i=0;i<b.length();i++) {
			int n = b.charAt(i)-64;
			System.out.print(n+" ");
		}
	}

}
