package SW_EA;

import java.util.Scanner;

public class SW_15230 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			char [] c = sc.next().toCharArray();
			int cnt = 0;
			for(int j = 0; j < c.length; j++) {
				char z = (char)(j+97);
				if(c[j]==z) cnt++;
				else break;
			}
			System.out.printf("#%d %d\n",i+1,cnt);
		}
	}

}
