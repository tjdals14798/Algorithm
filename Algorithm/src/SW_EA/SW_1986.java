package SW_EA;

import java.util.Scanner;

public class SW_1986 {
//	1부터 N까지의 숫자에서 홀수는 더하고 짝수는 뺐을 때 최종 누적된 값을 구해보자.

//	N은 1 이상 10 이하의 정수이다. (1 ≤ N ≤ 10)

//	가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다. 각 테스트 케이스에는 N이 주어진다.

//	각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 누적된 값을 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int sum=1;
			int N = sc.nextInt();
			
			for(int j=2;j<=N;j++) {
				if(j%2==1) sum+=j;	
				else sum-=j;
			}
			System.out.println("#"+i+" "+sum);
		}
	}

}
