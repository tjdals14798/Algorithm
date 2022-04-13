package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14655 {
//	욱제가 주로 하는 게임은 아주 단순하고, 친숙한 게임이다. 바로 동전 뒤집기 게임이다. 이 게임에 쓰이는 동전의 양면에는 절댓값이 같고 부호가 다른 정수가 한 면에 하나씩 쓰여 있다.
//	(단, 동전끼리는 쓰인 수의 절댓값이 다를 수 있다) 한 플레이어 당 두 번의 라운드가 주어진다. 모든 라운드는 같은 동전으로 진행되며, 딜러는 각 라운드마다 N개의 동전을 임의로 섞고 이를 일렬로 배열한다.
//	이때, 동전의 앞뒤 방향도 바뀔 수 있다. 첫 번째 라운드에서는 동전에 표시된 값들의 합이 최대가 되도록 뒤집어야 하고, 두 번째 라운드에서는 동전에 표시된 값들의 합이 최소가 되도록 뒤집어야 한다.
//	(첫 번째 라운드 동전 값의 합) - (두 번째 라운드 동전 값의 합)이 해당 플레이어가 게임에서 획득한 점수이고, 이 점수가 최대가 되는 플레이어가 바로 게임의 승자가 된다.
//	욱제는 엄지, 검지, 중지를 이용해서 항상 연속한 3개의 동전을 뒤집는 최고의 동전 뒤집러이다. 욱제는 연속한 3개의 동전을 뒤집지 않으면 이길 수 없다고 생각하기 때문에 실패하는 경우 없이 항상 연속한 3개의 동전만 뒤집는다.
//	동전 배열의 양 끝에서 벗어나서 양 끝의 동전만 뒤집거나 양 끝의 두 개 동전만 뒤집는 것도 가능하다. 동전을 뒤집는 횟수에 제한은 없다.

//	첫째 줄에 동전의 수 N이 주어진다. (1 ≤ N ≤ 10,000) 둘째 줄에 욱제의 첫 번째 라운드의 N개 동전의 배열이 주어진다.
//	셋째 줄에 욱제의 두 번째 라운드의 N개 동전의 배열이 주어진다. 동전에 적히는 수는 절댓값 10,000 이하의 정수이다.

//	욱제가 이번 게임에서 획득할 점수를 출력한다.
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		StringTokenizer s1 = new StringTokenizer(bf.readLine());
		StringTokenizer s2 = new StringTokenizer(bf.readLine());
		
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int res = 0;
		
		for(int i=0;i<n;i++) {
			arr1[i]=Math.abs(Integer.parseInt(s1.nextToken()));
			arr2[i]=Math.abs(Integer.parseInt(s2.nextToken()));
			
			res += arr1[i]+arr2[i];
		}
		
		System.out.println(res);	

	}

}
