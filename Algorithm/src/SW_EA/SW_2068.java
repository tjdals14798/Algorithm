package SW_EA;

import java.util.Arrays;
import java.util.Scanner;

public class SW_2068 {
//	각 수는 0 이상 10000 이하의 정수이다.

//	가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//	각 테스트 케이스의 첫 번째 줄에는 10개의 수가 주어진다.

//	출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int arr[] = new int[10];
	
		for(int i=1;i<=T;i++) {
			
			for(int j=0;j<arr.length;j++) {
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("#"+i+" "+arr[arr.length-1]);
		}
	}

}
