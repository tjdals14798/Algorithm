package stu;

import java.util.Scanner;

public class pg_4 {

//	0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
//	x의 모든 0을 제거합니다.
//	x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
//	예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int [] cnt = new int[2];
		
		while(!str.equals("1")) {
			for(int i = 0; i < str.length();i++) {
				if(str.charAt(i)=='0') cnt[1]++; // 0 확인			
			}
			str = str.replace("0", "");  // 0 제거
			str = Integer.toBinaryString(str.length());  //str의 길이를 2진 변환
			cnt[0]++;
		}
		System.out.println(cnt[0]+" "+cnt[1]);

	}

}
