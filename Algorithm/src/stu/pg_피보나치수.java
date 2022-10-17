package stu;

public class pg_피보나치수 {

	public static void main(String[] args) {
		int n = 3;
		int a0 = 0, a1 = 1, a2 = 1;
		
		for(int i = 2; i <= n;i++) {
			a2 = (a0+a1) % 1234567;
			a0 = a1 % 1234567;
			a1 = a2 % 1234567;
		}
		System.out.println(a2);
	}

}
