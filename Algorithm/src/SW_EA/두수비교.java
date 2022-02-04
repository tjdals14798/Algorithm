package SW_EA;

import java.util.Scanner;

public class 두수비교 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A =0;
		int B =0;
		
		for(int i =1; i<=T ;i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A<B) {
				System.out.println("#"+i+" <");
			}else if(A>B){
				System.out.println("#"+i+" >");
			}else {
				System.out.println("#"+i+" =");
			}
		}

	}

}
