package SW_EA;

import java.util.Scanner;

public class SW_1945 {
//	숫자 N은 아래와 같다. N=2a x 3b x 5c x 7d x 11e ,N이 주어질 때 a, b, c, d, e 를 출력하라.

//	N은 2 이상 10,000,000 이하이다.

//	가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다. 각 테스트 케이스의 첫 번째 줄에 N 이 주어진다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			int N = sc.nextInt();
			
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			int e=0;
			
			while(N%2==0) {N/=2;a++;}
			while(N%3==0) {N/=3;b++;}
			while(N%5==0) {N/=5;c++;}
			while(N%7==0) {N/=7;d++;}
			while(N%11==0) {N/=11;e++;}
			
			System.out.println("#"+i+" "+a+" "+b+" "+c+" "+d+" "+e);
		}

	}

}
