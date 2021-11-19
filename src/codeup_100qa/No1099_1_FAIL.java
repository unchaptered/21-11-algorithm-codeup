package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1099_1_FAIL {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		
		// 미로 형성
		int size=10;
		int mazeGround[][]=new int[10][10];
		for (int i=0; i<size; i++) {
			String inputLine[]=scan.readLine().split(" ");
			for (int j=0; j<size; j++) { 
				mazeGround[i][j]=Integer.parseInt(inputLine[j]);
			}
		}
		
		//미로 탐색
		int posiX=1;
		int posiY=1;
		mazeGround[1][1]=9;
		while(true) {
			// 우측 벽 존재 파악 변수 선언
			int target=mazeGround[posiX][posiY+1];
			// 발자취 남기기
			if(target==1 || target==2) {
				posiX++;
				if(mazeGround[posiX][posiY]==2) {
					mazeGround[posiX][posiY]=9;
					break;
				}else{
					mazeGround[posiX][posiY]=9;
				}
			} else {
				posiY++;
				if(mazeGround[posiX][posiY]==2) {
					mazeGround[posiX][posiY]=9;
					break;
				} else {
					mazeGround[posiX][posiY]=9;
				}
			}

		};
		
		// 결과 출력
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(mazeGround[i][j]+" ");
			}
			System.out.println();
		}
	}
}
