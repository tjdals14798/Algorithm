package Baekjoon;

import java.util.Scanner;

public class bj_12927 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean [] arr = new boolean[str.length()+1];
		
		for (int i = 0; i < str.length(); i++)
            arr[i+1] = str.charAt(i)=='Y';
		
		int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i]) continue;
            cnt++;
            for (int j = i; j < arr.length; j+=i)
                arr[j] = !arr[j];
        }
        System.out.println(cnt);
    }

}
