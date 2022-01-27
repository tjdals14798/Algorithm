package bj_bronze;

import java.util.Scanner;

public class bj_2896 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fruit[] = new int [3];
		int cocktail[] = new int[3];
		float res[]= new float[3];
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i<3;i++) {
			fruit[i]=sc.nextInt();
		}	
		for(int i = 0; i<3;i++) {
			cocktail[i]=sc.nextInt();
		}
	
		//기준이 될 인덱스 추출
				int idx = 0;
				//마지막 제조 비율
				float tmp = 0;
				
				for(int i=0;i<3;i++) {
					if(min>fruit[i]-cocktail[i]) {
						min=fruit[i]-cocktail[i];
						idx=i;
					}
				}
				
				//어느 하나의 주스가 소진될 때의 몫과 마지막 비율
				min = fruit[idx]/cocktail[idx];//3
				tmp = fruit[idx]%cocktail[idx];//1
				tmp = tmp/cocktail[idx];//0.3333
				res[idx]=0;
				
				if(idx==0) {
					res[1]=fruit[1]-min*cocktail[1]-tmp*cocktail[1];
					res[2]=fruit[2]-min*cocktail[2]-tmp*cocktail[2];
				}else if(idx==1) {
					res[0]=fruit[0]-min*cocktail[0]-tmp*cocktail[0];
					res[2]=fruit[2]-min*cocktail[2]-tmp*cocktail[2];
				}else if(idx==2) {
					res[1]=fruit[1]-min*cocktail[1]-tmp*cocktail[1];
					res[2]=fruit[2]-min*cocktail[2]-tmp*cocktail[2];
				}
				
				for(int j=0;j<3;j++) {
					if(res[j]==0) {
						System.out.print(0+" ");
						continue;
					}
					System.out.printf("%.6f",res[j]);
					System.out.print(" ");
				}
		
	}

}
