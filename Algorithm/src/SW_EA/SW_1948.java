package SW_EA;

import java.util.Scanner;

public class SW_1948 {
//	월 일로 이루어진 날짜를 2개 입력 받아, 두 번째 날짜가 첫 번째 날짜의 며칠째인지 출력하는 프로그램을 작성하라.

//	월은 1 이상 12 이하의 정수이다. 각 달의 마지막 날짜는 다음과 같다.
//	1/31, 2/28, 3/31, 4/30, 5/31, 6/30, 7/31, 8/31, 9/30, 10/31, 11/30, 12/31
//	두 번째 날짜가 첫 번째 날짜보다 항상 크게 주어진다.

//	가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//	각 테스트 케이스의 첫 번째 줄에는 4개의 수가 주어진다.
//	첫 번째 수가 월을 나타내고 두 번째 수가 일을 나타낸다. 그 다음 같은 형식으로 두 번째 날짜가 주어진다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int day[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		for(int tc=1;tc<=T;tc++) {
			int A =sc.nextInt(); int B =sc.nextInt(); int C =sc.nextInt(); int D =sc.nextInt();
			int cnt=0;
			
			cnt += D-B+1;
			
			for(int i=A;i<C;i++) {
				cnt+=day[i-1];
			}
			System.out.println("#"+tc+" "+cnt);
		}
	}
}
