package bj_bronze;

import java.util.Scanner;

public class bj_2684 {
//	���������� �ַ� �� ����� �Բ� ���� �����̴�. �� �� 3-���������� ���� ���� �� �� �ִ� �����̴�. �� ����� ���� 3-�������� �� �ϳ��� �����Ѵ�.
//	3-���������̶� �� �� �հ� ���� �����̰�, 8����(�ڵڵ�,�ڵھ�,�ھյ�,�ھվ�,�յڵ�,�յھ�,�վյ�,�վվ�)�� �ִ�.
//	���� ������ ���� 1���� 40�� ������. �� ���� ������ ������ ������ �������� ���� ������� ���̿� ���´�. �� ���� 3-���������� ���� �� ���� ���Դ��� ����Ѵ�.
//	���� ���� ���� ������ ������ ����� �̱��.
//	���� 40�� ���� ����� �־����� ��, 3-���������� ���� �� �� ���Դ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 40���� ������ ��� �ո��� ��� �վվ��� 38�� ��Ÿ����.

//	ù° �ٿ� �׽�Ʈ ���̽��� ���� P(1 �� P �� 1000)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ������ 40�� ���� ����� �־�����. �̶�, �ո��� H��, �޸��� T�� ǥ���Ѵ�. 

//	�� �׽�Ʈ ���̽����� 3-���������� �� �� ��Ÿ�������� ����Ѵ�. �ڵڵ�, �ڵھ�, �ھյ�, �ھվ�, �յڵ�, �յھ�, �վյ�, �վվ� ������� �������� �����ؼ� ����Ѵ�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int P = sc.nextInt();
		String res = "";
		
		for(int i=0;i<P;i++) {
			String N = sc.next();
			int TTT=0; int TTH=0; int THT=0; int THH=0; int HTT=0; int HTH=0; int HHT=0; int HHH=0;
			
			for(int j=0,c=3;c<=N.length();j++,c++) {			
				res = N.substring(j,c);
				if(res.equals("TTT")) TTT++;
				else if(res.equals("TTH")) TTH++;
				else if(res.equals("THT")) THT++;
				else if(res.equals("THH")) THH++;
				else if(res.equals("HTT")) HTT++;
				else if(res.equals("HTH")) HTH++;
				else if(res.equals("HHT")) HHT++;
				else if(res.equals("HHH")) HHH++;
				System.out.println(res);
				res="";
			}
			System.out.println(TTT+" "+TTH+" "+THT+" "+THH+" "+HTT+" "+HTH+" "+HHT+" "+HHH);
		}

	}

}
