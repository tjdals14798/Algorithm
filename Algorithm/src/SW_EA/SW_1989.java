package SW_EA;

import java.util.Scanner;

public class SW_1989 {
//	"level" 과 같이 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 회문(回文, palindrome)이라 한다.
//	단어를 입력 받아 회문이면 1을 출력하고, 아니라면 0을 출력하는 프로그램을 작성하라.

//	각 단어의 길이는 3 이상 10 이하이다.
	
//	가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//	각 테스트 케이스의 첫 번째 줄에 하나의 단어가 주어진다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb =null;
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			String N = sc.next();
			sb = new StringBuffer(N);
			if(N.equals(sb.reverse().toString())) System.out.println("#"+i+" "+1);
			else System.out.println("#"+i+" "+0);
		}
	}

}
