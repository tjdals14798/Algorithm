package �迭;
import java.util.Scanner;

public class bj_4344 {

//	���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�.
	
//	ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
//	��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
//	������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
	
//	�� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		int[] arr;
		
		for(int i=0;i<c;i++) {
			int N=sc.nextInt();
			arr=new int[N];
			
			double sum = 0;
			
			for(int j=0;j<N;j++) {
				arr[j]=sc.nextInt();
				sum+=arr[j];
			}
			
			double avg = sum/N;
			double cnt = 0;
			
			for(int j=0;j<N;j++) {
				if(avg<arr[j]) {
					cnt++;
				}
			}
			
			System.out.printf("%.3f%%\n",(cnt/N)*100);
		}
		
	}

}
