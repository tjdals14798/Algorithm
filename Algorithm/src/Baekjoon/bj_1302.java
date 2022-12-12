package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class bj_1302 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		String res = "";
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < N; i++) arr.add(br.readLine());
		
		TreeSet<String> set = new TreeSet<String>(arr);
		
		for (String str : set) {
			int a = Collections.frequency(arr, str);
            if(max < a) {
            	max = a;
            	res = str;
            }
        }
		System.out.println(res);
	}

}
