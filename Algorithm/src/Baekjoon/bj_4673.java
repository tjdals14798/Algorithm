package Baekjoon;

public class bj_4673 {

	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		 
		for (int i = 1; i < 10001; i++){
			int n = se(i);
		
			if(n < check.length){
				check[n] = true;
			}
		}
        
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}
	}
 
	public static int se(int num){
		int sum = num;
    
		while(num != 0){
			sum = sum + (num % 10); 
			num = num/10;
		}
    
		return sum;
	}   

}
