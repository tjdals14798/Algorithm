package 브루트_포스;

import java.util.Scanner;

public class bj_2798 {
	
//	카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.
//	한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
//	김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
//	이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
//	N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
	
//	첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
//	합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

//	첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = sc.nextInt();
		int num = sc.nextInt();
		int arr[] =new int[cnt]; 
		
		for(int i = 0; i < cnt; i++) {
			arr[i]=sc.nextInt();
		}
		
		int res = black(arr,cnt,num);
		System.out.println(res);
	}	
	static int black(int[] arr, int cnt, int num) {
		int result = 0;

		for (int i = 0; i < cnt - 2; i++) {

			for (int j = i + 1; j < cnt - 1; j++) {

				for (int k = j + 1; k < cnt; k++) {
						
					int sum = arr[i] + arr[j] + arr[k];
						
					if (num == sum) {	
						return sum;
					}
						
					if(result < sum && sum < num) {
						result = sum;
					}
				}
			}
		}		
		return result;
	}

}
