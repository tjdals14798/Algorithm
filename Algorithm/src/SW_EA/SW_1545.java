package SW_EA;

import java.util.Scanner;

public class SW_1545 {
//	주어진 숫자부터 0까지 순서대로 찍어보세요

//	아래는 입력된 숫자가 N일 때 거꾸로 출력하는 예시입니다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = sc.nextInt();i>=0;i--) {
			System.out.print(i+" ");
		}

	}

}
