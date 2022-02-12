package bj_bronze;

import java.util.Scanner;

public class bj_18766_F {
//	범고래와 돌고래는 카드놀이를 좋아한다. 각 카드는 빨강 (R), 노랑 (Y), 파랑 (B) 중 하나의 색으로 칠해져 있고 0-9 사이의 숫자가 적혀있다. 색과 숫자가 같은 카드가 여러 장 있을 수도 있다.
//	최근 범고래는 모든 게임에서 졌고, 돌고래가 몰래 카드를 바꿔치기 한다는 의심을 하게 되었다.
//	범고래는 기억력이 매우 좋아서 카드놀이를 하기 전 n장의 카드와 카드놀이를 하면서 둘이 플레이 한 n장의 카드를 모두 기억하고 있다. 하지만 돌고래가 카드를 바꿔치기 했는지 아닌지 판단을 하는 능력은 부족하다.
//	돌고래가 카드 바꿔치기를 한 증거가 있는지 아닌지 판단하는 프로그램을 만들어보자.
	
//	첫 줄에 테스트 케이스의 수 T가 주어진다. 	각 테스트 케이스는 다음과 같이 세 줄로 이루어져 있다.

//	첫째 줄에 카드의 개수 n이 주어진다.	둘째 줄에 카드놀이를 하기 전 범고래가 기억하는 n장의 카드를 나타내는 n개의 문자열이 공백으로 구분되어 주어지는데,
//	각 문자열은 두 글자이며 첫 글자는 R, Y, B 중 하나이고 두 번째 글자는 숫자 0-9중 하나이다.
//	셋째 줄에는 카드놀이가 끝난 후 범고래가 기억하는 n장의 카드가 주어진다. 입력 형식은 둘째 줄과 같다.

//	각각의 테스트 케이스마다 한 줄에 하나씩 돌고래가 카드를 바꿔치기 했으면 "CHEATER"를, 아니면 "NOT CHEATER"를 따옴표 없이 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int C = sc.nextInt();
			int cnt=0;
			String tig[]=new String[C];
			String sto[]=new String[C];
			for(int j=0;j<C;j++) {
				tig[j]=sc.next();
				sto[j]=sc.next();
			}
			for(int h=0;h<C;h++) {
				int c=0;
				while(tig[h].equals(sto[c])) {
					sto[c]="0"; cnt++;
				}
			}
			if(cnt==C) System.out.println("NOT CHEATER");
			else System.out.println("CHEATER");
		}
	}

}
