package codeup_100qa;

import java.util.Scanner;

public class No1097 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// 행렬 생성
		int numArr[][]=new int[19][19];
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				numArr[j][i]=scan.nextInt();
			}
		}
		
		// 뒤집기 실행(count 횟수, x , y 뒤집을 축 )
		int x;
		int y;
		int count=scan.nextInt();
		for(int k=0; k<count; k++) {
			x=scan.nextInt();
			y=scan.nextInt();
			for (int i=0; i<19; i++) {
				for (int j=0; j<19; j++) {
					numArr[x-1][j]=numArr[x-1][j]==1 ? 0 : 1;
				}
				numArr[i][y-1]=numArr[i][y-1]==1 ? 0 : 1;
			}
		}
		scan.close();
		
		// 출력문
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				System.out.print(numArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
