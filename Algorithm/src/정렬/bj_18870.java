package 정렬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class bj_18870 {

//	수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
//	Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.
//	X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

//	첫째 줄에 N이 주어진다.
//	둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.
	
//	첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		
		int arr[]=new int[cnt]; //입력 배열
		int sarr[]=new int[cnt]; //정렬 배열
		HashMap<Integer, Integer> rankmap = new HashMap<Integer, Integer>(); // rank를 매길 hashmap
		
		for(int i = 0; i < cnt; i++) {
			sarr[i]=arr[i]=sc.nextInt(); //동시에 값 입력
		}
		
		//정렬
		Arrays.sort(sarr);

		//정렬된 sarr를 순회하면서 map에 넣어줌
		int rank = 0;
		for(int r : sarr) {		
			if(!rankmap.containsKey(r)) {
				rankmap.put(r,rank);
				rank++; //랭크 증가
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : arr) {
			int ranking = rankmap.get(key); // key에 대한 순위 값
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
	}

}
