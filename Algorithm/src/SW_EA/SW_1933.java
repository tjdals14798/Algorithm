package SW_EA;

import java.util.Scanner;

public class SW_1933 {
//	입력으로 1개의 정수 N 이 주어진다.
//	정수 N 의 약수를 오름차순으로 출력하는 프로그램을 작성하라.

//	N은 1이상 1,000이하의 정수이다. (1 ≤ N ≤ 1,000)

//	입력으로 정수 N 이 주어진다.

//	정수 N 의 모든 약수를 오름차순으로 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			if(N%i==0) {
				System.out.print(i+" ");
			}
		}
	}

}
