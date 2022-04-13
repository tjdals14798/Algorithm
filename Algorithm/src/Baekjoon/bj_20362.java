package Baekjoon;

import java.util.Scanner;

public class bj_20362 {
//	축제를 즐기던 철이는 퀴즈쇼가 끝난 뒤 커뮤니티에 당첨자보다 정답을 빨리 쳤다며 아쉬워하는 사람들이 나타난 것을 보았다.
//	채팅 기록을 갖고 있는 철이는 그런 아쉬운 사람들이 몇 명이나 있는지 알고 싶어졌다. 채팅 기록은 여러 줄로 이루어져 있는데, 각 줄에는 채팅을 친 사람의 닉네임과 채팅 내용이 담겨있다.
//	채팅 기록과 당첨자가 주어졌을 때 아쉬운 사람의 수를 구해보자. 아쉬운 사람은 당첨자보다 빨리 정답을 외친 사람이다.

//	첫 번째 줄에 채팅 개수 N과 정답자의 닉네임 S가 공백으로 구분되어 주어진다. (2 ≤ N ≤ 1,000)
//	두 번째 줄부터 차례로 N개의 채팅 기록이 시간순으로 주어진다. 채팅 기록은 닉네임과 채팅 내용이 공백으로 구분되어 주어진다. 
//	각 닉네임과 채팅 내용은 길이가 1이상 10이하이며 알파벳 소문자로만 이루어져 있다.
//	한 사람이 두 번 이상 채팅을 친 경우는 주어지지 않으며, 정답자의 닉네임 S는 반드시 채팅 기록에 등장한다.

//	첫 번째 줄에 아쉬운 사람의 명수를 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); String S = sc.next();
		String[][] arr = new String[N][2];
		int cnt = 0;
		
		for(int i=0;i<N;i++) {
			arr[i][0] = sc.next(); arr[i][1] = sc.next();
		}
		
		for(int i=0;i<N-1;i++) {
			if(arr[N-1][1].equals(arr[i][1])) cnt++;
		}
		if(!arr[N-1][0].equals(S)) cnt=0;
		System.out.println(cnt);
	}

}
