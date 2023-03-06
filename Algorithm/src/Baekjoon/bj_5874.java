package Baekjoon;

import java.util.Scanner;

public class bj_5874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String[] line = sc.nextLine().split("");
			int count = 0, sum = 0;
			for (int i = 1; i < line.length; i++) {
				if (line[i].compareTo(line[i-1]) == 0) {
					if (line[i].compareTo("(") == 0)
						count++;
					else
						sum += count;
				}
			}
			System.out.println(sum);
		}
	}
}