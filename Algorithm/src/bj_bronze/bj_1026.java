package bj_bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bj_1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<Integer> Aarr = new ArrayList<Integer>();
		ArrayList<Integer> Barr = new ArrayList<Integer>();
		int amax = 0,	bmin = 0,	sum = 0;

		for(int i = 0;i<T;i++) {
			Aarr.add(sc.nextInt());
		}
		for(int i = 0;i<T;i++) {
			Barr.add(sc.nextInt());
		}
		
		for(int i = 0;i<T;i++) {			
			amax=Collections.max(Aarr);
			bmin=Collections.min(Barr);
			sum+=amax*bmin;
			
			Aarr.remove(Integer.valueOf(amax));
			Barr.remove(Integer.valueOf(bmin));
		}
		
		System.out.println(sum);
		
	}

}
