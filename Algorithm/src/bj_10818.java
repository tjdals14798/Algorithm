import java.util.Arrays;
import java.util.Scanner;

public class bj_10818 {
	
//	N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	
//	ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
//	��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
//	
//	ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num[] = new int[N];
		
		for(int i = 0; i<N;i++) {
			num[i] =sc.nextInt();
			System.out.println(num[i]);
		}
		
		Arrays.sort(num);
		
		System.out.println(num[num.length-1]+" "+num[0]);
		
	}

}
