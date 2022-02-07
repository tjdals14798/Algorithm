package SW_EA;

import java.util.Scanner;

public class SW_2027 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.print("#");
				}else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<5;i++) {
			char c []= {'+','+','+','+','+'};
			c[i]='#';
			System.out.println(c);
		}
		
	}

}
