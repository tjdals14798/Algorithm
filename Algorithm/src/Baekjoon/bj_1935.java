package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_1935 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		double arr[] = new double[N];
		for(int i = 0; i < arr.length; i++) arr[i] = Double.parseDouble(br.readLine());
		
		Stack<Double> st = new Stack<>();
		double res = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if('A' <= str.charAt(i) && 'Z' >= str.charAt(i)) {
				st.push(arr[str.charAt(i) - 'A']);
			}else {
				if(!st.isEmpty()) {
					double a = st.pop();
					double b = st.pop();
					switch (str.charAt(i)) {
						case '+':
							res = b + a;
							st.push(res);
							continue;
						case '-':
							res = b - a;
							st.push(res);
							continue;
						case '*':
							res = b * a;
							st.push(res);
							continue;
						case '/':
							res = b / a;
							st.push(res);
							continue;
					}
				}
			}
		}
		System.out.printf("%.2f",st.pop());
	}

}
