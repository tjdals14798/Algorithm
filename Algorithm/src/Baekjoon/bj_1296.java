package Baekjoon;

import java.util.Scanner;

public class bj_1296 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int nlan = name.length();
		int L = nlan - name.replaceAll("L", "").length();	// ������ �̸����� L�� ����
		int O = nlan - name.replaceAll("O", "").length();	// ������ �̸����� O�ǰ���
		int V = nlan - name.replaceAll("V", "").length();	// ������ �̸����� V�� ����
		int E = nlan - name.replaceAll("E", "").length();	// ������ �̸����� E�� ����
		String res = "ZZZZZZZZZZZZZZZZZZZZ";	//���������� ���� �������� Z 
		int max = 0;
		
		int t = sc.nextInt();
		
		for(int i = 0;i < t;i++) {
			String tname = sc.next();
			int tnlan = tname.length();
			int l = tnlan - tname.replaceAll("L", "").length();	// ������ ������ L�� ����
			int o = tnlan - tname.replaceAll("O", "").length();	// ������ ������ O�� ����
			int v = tnlan - tname.replaceAll("V", "").length();	// ������ ������ V�� ����
			int e = tnlan - tname.replaceAll("E", "").length();	// ������ ������ E�� ����
			
			int mod = mod(L+l,O+o,V+v,E+e);	//��ȯ���� ����
			
			if(mod > max) {	//������ ���� max���� ũ�� Ȯ���� ���� ���̸�
				max = mod;
				res = tname;
			}else if(mod == max) {	//������ ���� ���ʿ� ���ٸ� ���� ������ ���� �ռ��� ��
				if(res.compareTo(tname) > 0) {
					res = tname;
				}
			}
		}
		System.out.println(res);
	}
	
	public static int mod(int l, int o, int v, int e) {
		return ((l+o) * (l+v) * (l+e) * (o+v) * (o+e) * (v+e)) % 100;
	}

}
