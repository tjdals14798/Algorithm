package bj_bronze;

import java.util.Scanner;

public class bj_2684 {
//	동전게임은 주로 두 사람이 함께 즐기는 게임이다. 이 중 3-동전게임은 여러 명이 할 수 있는 게임이다. 각 사람은 각각 3-동전수열 중 하나를 선택한다.
//	3-동전수열이란 앞 뒤 앞과 같은 수열이고, 8가지(뒤뒤뒤,뒤뒤앞,뒤앞뒤,뒤앞앞,앞뒤뒤,앞뒤앞,앞앞뒤,앞앞앞)가 있다.
//	이제 심판은 동전 1개를 40번 던진다. 그 다음 심판은 동전이 앞인지 뒤인지를 던진 순서대로 종이에 적는다. 그 다음 3-동전수열이 각각 몇 번씩 나왔는지 기록한다.
//	가장 많이 나온 수열을 선택한 사람이 이긴다.
//	동전 40번 던진 결과가 주어졌을 때, 3-동전수열이 각각 몇 번 나왔는지를 출력하는 프로그램을 작성하시오. 예를 들어, 40개의 동전이 모두 앞면일 경우 앞앞앞은 38번 나타난다.

//	첫째 줄에 테스트 케이스의 개수 P(1 ≤ P ≤ 1000)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 동전을 40번 던진 결과가 주어진다. 이때, 앞면은 H로, 뒷면은 T로 표현한다. 

//	각 테스트 케이스마다 3-동전수열이 몇 번 나타났는지를 출력한다. 뒤뒤뒤, 뒤뒤앞, 뒤앞뒤, 뒤앞앞, 앞뒤뒤, 앞뒤앞, 앞앞뒤, 앞앞앞 순서대로 공백으로 구분해서 출력한다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		String res = "";
		
		for(int i=0;i<P;i++) {
			String N = sc.next();
			int TTT=0; int TTH=0; int THT=0; int THH=0; int HTT=0; int HTH=0; int HHT=0; int HHH=0;
			
			for(int j=0,c=3;c<=N.length();j++,c++) {			
				res = N.substring(j,c);
				if(res.equals("TTT")) TTT++;
				else if(res.equals("TTH")) TTH++;
				else if(res.equals("THT")) THT++;
				else if(res.equals("THH")) THH++;
				else if(res.equals("HTT")) HTT++;
				else if(res.equals("HTH")) HTH++;
				else if(res.equals("HHT")) HHT++;
				else if(res.equals("HHH")) HHH++;
				System.out.println(res);
				res="";
			}
			System.out.println(TTT+" "+TTH+" "+THT+" "+THH+" "+HTT+" "+HTH+" "+HHT+" "+HHH);
		}

	}

}
