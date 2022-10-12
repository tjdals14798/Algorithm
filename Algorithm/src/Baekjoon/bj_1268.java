package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class bj_1268 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[][] = new int[n][5];
		int max = 0;
		int res = 0;
		
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < 5;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i = 0;i < n;i++) {	//	1번 학생부터
			Set<Integer> same = new HashSet<>();
			for(int j = 0;j < 5;j++) {	//	학년별로
				for(int k = 0;k < n;k++) {	//	학생마다
					if(arr[i][j] == arr[k][j] && i != k) {	//본인제외 자신과 같은 반이었다면
						same.add(k);	//	몇 번 학생인지
					}
				}
			}
			if(max < same.size()) {	//	이전의 사람보다 아는사람이 많은 더 많다면
				max = same.size();	// 최대값 변경
				res = i;	//	res에 i번째 학생인지 저장
			}
		}
		System.out.println(res+1);

	}

}
