package codeup_100qa;

import java.util.Scanner;

public class No1097 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// ��� ����
		int numArr[][]=new int[19][19];
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				numArr[j][i]=scan.nextInt();
			}
		}
		
		// ������ ����(count Ƚ��, x , y ������ �� )
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
		
		// ��¹�
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				System.out.print(numArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
