package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_10769 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int smile = (str.length() - str.replace(":-)", "").length()) / 3;
		int sad = (str.length() - str.replace(":-(", "").length()) / 3;

		String res = "";
		if (smile == 0 && sad == 0) {
			res = "none";
		} else if (smile > sad) {
			res = "happy";
		} else if (sad > smile) {
			res = "sad";
		} else {
			res = "unsure";
		}
		System.out.println(res);
	}
}
