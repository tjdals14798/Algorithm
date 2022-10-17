package stu;

public class pg_다음큰숫자 {

	public static void main(String[] args) {
		int res = 0;
		int n = 15;
		int cnt = binary(n);
		int idx = 1;
		while(true) {
			int n1 = n+idx;
			if(cnt==binary(n1)) {
				res = n1;
				break;
			}
			idx++;
		}
		System.out.println(res);

	}

	public static int binary(int a) {
		String str = Integer.toBinaryString(a);
		char [] cArr = str.toCharArray();
		int cnt = 0;
		
		for(char i:cArr) {
			if(i=='1') cnt++;
		}
		return cnt;
	}
}
