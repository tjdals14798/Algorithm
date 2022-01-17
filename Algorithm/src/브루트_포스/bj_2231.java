package 브루트_포스;

import java.util.Scanner;

public class bj_2231 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int res = 0;
		
		for(int i=0; i<cnt; i++) {
			//계속 초기화
			int num = i;
			int sum = 0;
			//마지막 자리 더하기
			while(num!=0) {
				sum+=num%10;
				num/=10;
			}
			//생성자 찾기
			if(sum+i==cnt) {
				res=i;
				break;
			}
		}
		
		System.out.println(res);

	}

}
