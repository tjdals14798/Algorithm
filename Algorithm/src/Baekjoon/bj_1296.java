package Baekjoon;

import java.util.Scanner;

public class bj_1296 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int nlan = name.length();
		int L = nlan - name.replaceAll("L", "").length();	// 연두의 이름에서 L의 개수
		int O = nlan - name.replaceAll("O", "").length();	// 연두의 이름에서 O의개수
		int V = nlan - name.replaceAll("V", "").length();	// 연두의 이름에서 V의 개수
		int E = nlan - name.replaceAll("E", "").length();	// 연두의 이름에서 E의 개수
		String res = "ZZZZZZZZZZZZZZZZZZZZ";	//사전적으로 가장 마지막인 Z 
		int max = 0;
		
		int t = sc.nextInt();
		
		for(int i = 0;i < t;i++) {
			String tname = sc.next();
			int tnlan = tname.length();
			int l = tnlan - tname.replaceAll("L", "").length();	// 연두의 팀명에서 L의 개수
			int o = tnlan - tname.replaceAll("O", "").length();	// 연두의 팀명에서 O의 개수
			int v = tnlan - tname.replaceAll("V", "").length();	// 연두의 팀명에서 V의 개수
			int e = tnlan - tname.replaceAll("E", "").length();	// 연두의 팀명에서 E의 개수
			
			int mod = mod(L+l,O+o,V+v,E+e);	//이환이의 공식
			
			if(mod > max) {	//공식의 값이 max보다 크면 확률인 높은 팀이름
				max = mod;
				res = tname;
			}else if(mod == max) {	//공식의 값이 최초와 같다면 사전 순으로 가장 앞서는 팀
				if(res.compareTo(tname) > 0) {
					res = tname;
				}
			}
		}
		System.out.println(res);
	}
	
	public static int mod(int l, int o, int v, int e) {
		return ((l+o) * (l+v) * (l+e) * (o+v) * (o+e) * (v+e)) % 100;
	}

}
