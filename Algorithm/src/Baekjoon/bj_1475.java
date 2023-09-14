package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_1475 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int arr[] = new int[10];
        
        for (int i = 0; i < s.length(); i++) {
            int num = Character.getNumericValue(s.charAt(i));
            if (num == 6) arr[9]++;
            else arr[num]++;
        }
        
        int max = 0;
        for (int i = 0; i < 9; i++) max = Math.max(max,arr[i]);
        
        int num = arr[9] / 2;
        if (arr[9] % 2 == 1) num++;
        max = Math.max(max, num);
        
        System.out.print(max);
    }
}