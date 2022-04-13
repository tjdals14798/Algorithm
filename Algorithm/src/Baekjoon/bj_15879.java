package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_15879 {
//	현정이는 사람의 이름과 사람을 매칭시키는 능력은 매우 떨어지지만, 어떤 핸들이 자신이 아는 핸들 중 사전 순으로 몇 번째인지 기억하는 쓸데없는 능력을 가지고 있다.
//	이를 이용해 상민이는 현정이가 아는 핸들 목록 중 자신이 몇 번째인지를 알아내어 앞으로 번호를 붙여 다니려고 한다.
//	정체성을 지키고 싶은 상민이를 위해 현정이의 어지러운 머리속에서 임의의 순서를 가지는 핸들을 찾아보자.

//	첫 줄에 현정이가 기억하고 있는 핸들의 개수 N과 I(1 ≤ I, N ≤ 100)이 주어진다. 이후 N개의 줄에 걸쳐 현정이 기억하는 핸들이 무작위 순서로 주어진다.
//	모든 핸들은 영어 소문자와 숫자로만 이루어져 있으며 길이는 20보다 짧거나 같다. 입력되는 핸들 중 완전히 같은 핸들은 없음이 보장된다.

//	현정이가 기억하고 있는 핸들 중 사전 순으로 I번째인 핸들을 한 줄에 출력한다.
//	이 문제에서 정의하는 사전 순이란 숫자가 알파벳보다 먼저이며, 숫자는 작을 수일수록 먼저이고, 알파벳은 순서가 빠를수록 먼저이다.\
//	또한 'abcd'와 'abc' 같이 어떤 한 문자열이 다른 문자열의 접두사가 될 때에는 길이가 더 짧은 쪽이 먼저이다.
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int N = sc.nextInt(); int I = sc.nextInt();
		String arr[] = new String[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=sc.next();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[I-1]);	
	}

}
