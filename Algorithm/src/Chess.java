import java.util.Scanner;

public class Chess {
	
//	동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
//
//	체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
//
//	체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//
//	동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.

	public static void main(String[] args) {
//	첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
		Scanner sc = new Scanner(System.in);
		
		int Z=0;
		int chess[]= {1,1,2,2,2,8} ;
		int array[]=new int[6];
		
		System.out.println("킹,퀸,룩,비숍,나이트,폰의 개수를 순서대로 입력하시오.");
		int num = sc.nextInt();
		
		for(int i = 5,c=0;i>=0;i--,c++) {
			Z=num%10;
			array[c]=chess[i]-Z;
			num=num/10;
		}
		for(int i=5;i>=0;i--) {
			System.out.print(array[i]+" ");
		}

	}

}
