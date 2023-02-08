package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_17478 {
	static int n;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		recur(0,"");
	}
	
	public static void recur(int cnt, String ub) {
		if(cnt == n) {
			System.out.println(ub + "\"����Լ��� ������?\"");
            System.out.println(ub + "\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
            System.out.println(ub + "��� �亯�Ͽ���.");
            return;
        }

        System.out.println(ub + "\"����Լ��� ������?\"");
        System.out.println(ub + "\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
        System.out.println(ub + "���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
        System.out.println(ub + "���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
        
        recur(cnt + 1, ub + "____");
        System.out.println(ub + "��� �亯�ϼ���.");
	}

}
