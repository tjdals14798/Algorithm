import java.util.Scanner;

public class bj_8958 {
	
//	"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
//	������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
//	"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//	OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	
//	ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.

//	�� �׽�Ʈ ���̽����� ������ ����Ѵ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] arr = new String[sc.nextInt()];
		
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		sc.close();
		
		for(int i =0;i<arr.length;i++) {
			int cnt = 0;
			int sum = 0;
			
			for(int j =0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='O') {
					cnt++;
				}else {
					cnt=0;
				}
				sum+=cnt;
			}
			System.out.println(sum);
		}
	}

}
