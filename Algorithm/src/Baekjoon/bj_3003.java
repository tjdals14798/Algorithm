package Baekjoon;
import java.util.Scanner;

public class bj_3003 {
	
//	�����̴� ������ â�� �����ٰ� ���� ü���ǰ� �ǽ��� �߰��ߴ�.
//	ü������ ������ �о�� �ɷ��� ������ �׷����� ������ ü������ �Ǿ���. ������, ������ �ǽ��� ��� �־�����, ��� �ǽ��� ������ �ùٸ��� �ʾҴ�.
//	ü���� �� 16���� �ǽ��� ����ϸ�, ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8���� �����Ǿ� �ִ�.
//	�����̰� �߰��� ��� �ǽ��� ������ �־����� ��, �� ���� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

	public static void main(String[] args) {
//	ù° �ٿ� �����̰� ã�� ��� ŷ, ��, ��, ���, ����Ʈ, ���� ������ �־�����. �� ���� 0���� ũ�ų� ���� 10���� �۰ų� ���� �����̴�.
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[6];
		int chess[]= {1,1,2,2,2,8} ;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
			arr[i]= chess[i]-arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		/*
		 * int Z=0; int chess[]= {1,1,2,2,2,8} ; int array[]=new int[6];
		 * 
		 * int num = sc.nextInt();
		 * 
		 * for(int i = 5,c=0;i>=0;i--,c++) { Z=num%10; array[c]=chess[i]-Z; num=num/10;
		 * } for(int i=5;i>=0;i--) { System.out.print(array[i]+" "); }
		 */

	}

}
