package �迭;
import java.util.Scanner;

public class bj_2562 {

//	9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	���� ���, ���� �ٸ� 9���� �ڿ���
//	3, 29, 38, 12, 57, 74, 40, 85, 61
//	�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
	
//	ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
	
//	ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[9];
		int max = 0;
		int cnt = 0;
		
		for(int i =0 ; i <num.length; i++) {
			num[i]= sc.nextInt();
			if(max<num[i]) {
				max=num[i];
				cnt = i+1;
			}
		}

		System.out.println(max);
		System.out.println(cnt);
	}
	
}
