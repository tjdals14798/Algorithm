package SW_EA;

import java.util.Scanner;

public class SW_1288 {
//	민석이는 1번 양부터 순서대로 세는 것이 재미없을 것 같아서 N의 배수 번호인 양을 세기로 하였다.
//	즉, 첫 번째에는 N번 양을 세고, 두 번째에는 2N번 양, … , k번째에는 kN번 양을 센다.
//	5N번 양을 세면 0에서 9까지 모든 숫자를 보게 되므로 민석이는 양 세기를 멈춘다.

//	첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

//	각 테스트 케이스의 첫 번째 줄에는 N (1 ≤ N ≤ 106)이 주어진다.
	
//	각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고,
//	최소 몇 번 양을 세었을 때 이전에 봤던 숫자들의 자릿수에서 0에서 9까지의 모든 숫자를 보게 되는지 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1;i<=T;i++) {
			int N = sc.nextInt();
			int c = N;
			boolean arr[] = new boolean[10];
			int cnt=1;
			
		while(true) {
			int sum = 0;
			c=cnt*N;
			String b=c+"";
			
			for(int q = 0;q<b.length();q++) {
				int a = c%10;
				arr[a]=true;
				c/=10;
			}
			
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==true) {
					sum++;//0~9
				}
			}
			
			if(sum==10)break;
			else cnt++;

		}
		
		System.out.println("#"+i+" "+(N*cnt));
		}
	}

}
