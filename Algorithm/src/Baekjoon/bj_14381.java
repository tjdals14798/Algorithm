package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class bj_14381 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1;tc <= T;tc++) {
			int N = sc.nextInt();
	        HashSet<Integer> hs = new HashSet<>();
	        int cur = N;
	        for (int i = 1; i <= 100; i++, cur+=N) {
	           int tmp = cur;
	           while (tmp != 0) {
	               hs.add(tmp%10);
	               tmp/=10;
	           }
	           if (hs.size() == 10)
	               break;
	        }
	        if(cur==0) System.out.printf("Case #%d: INSOMNIA\n",tc);
	        else System.out.printf("Case #%d: %d\n",tc,cur);
		}
	}
}
