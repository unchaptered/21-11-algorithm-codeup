package codeup_100qa;

import java.util.Scanner;

public class No1098_Scanner {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// 5 5
		int sizeX=scan.nextInt();
		int sizeY=scan.nextInt();
		int numArr[][]=new int[sizeX][sizeY];

		//3
		int count=scan.nextInt();
		
		for (int c=0; c<count; c++) {
			int length=scan.nextInt();
			int arrow=scan.nextInt();
			int posiX=scan.nextInt()-1;
			int posiY=scan.nextInt()-1;
			// 배열 상 좌표가 아니라 그래픽 상 1,1 우상하 좌표..... 하
			// 0 1 2 3 4 = 길이 5
			// 1 ㅇ  			1,1
			// 2      ㅇ     ㅇ   2,3 2,5
			// 3      
			// 4      
			// 5               
			// = 길이 6 (2,3)
			if(arrow==0) { // 가로축
				for(int i=0; i<length; i++) {
					numArr[posiX][posiY+i]=numArr[posiX+i][posiY]+1;
				}
			} else { // 세로축
				for(int i=0; i<length; i++) {
					numArr[posiX+i][posiY]++;
				}
			}
		}
		scan.close();
		for (int i=0; i<sizeX; i++) {
			for (int j=0; j<sizeY; j++) {
				System.out.print(numArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
