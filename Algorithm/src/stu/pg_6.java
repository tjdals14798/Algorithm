package stu;

public class pg_6 {

	public static void main(String[] args) {
		int arr [] = {1,2,3};
		int cnt = 1;
		int num = 0;
		boolean ck = true;
		
		while(ck) {
			boolean tr = false;
			num = cnt*arr[arr.length-1];
			
			for(int i = 0;i < arr.length-1;i++) {
				if(num%arr[i]!=0) {
					tr = false;
					break;
				}
				else {
					tr = true;
				}
			}
			if(tr == true) break;
			cnt++;
		}
		System.out.println(num);
	}

}
