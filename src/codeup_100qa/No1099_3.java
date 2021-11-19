package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class No1099_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));

		// 10 x 10 배열 생성 > 한 줄씩 BufferedReader 로 받고 옮겨 담기
		final int size=10;
		int inputArr[][]=new int[size][size];
		for (int i=0; i<size; i++) {
			String inputLine[]=scan.readLine().split(" ");
			for (int j=0; j<inputLine.length; j++) {
				inputArr[i][j]=Integer.parseInt(inputLine[j]);
			}
		}
		
		// 개미의 집은 무조건 inputArr[1][1] 에 있다...
		// 개미의 시작점도 inputArr[1][1] 이고 앞으로 inputArr[x][y] 으로 가는데...
		// 그 지점에 2가 있으면 멈춘다.
		int posiX=1;
		int posiY=1;
		while (true) {
			if(inputArr[posiX][posiY]==2) {
				// 먹이라면 멈춰
				inputArr[posiX][posiY]=9;
				break;
			} else if (inputArr[posiX][posiY+1]!=1) {
				// 벽이 아니면 오른쪽 이동
				inputArr[posiX][posiY]=9;
				if(posiY>7) {
					break;
				} else {
					posiY++;
				}
			} else {
				// 벽이면 아래로 이동
				inputArr[posiX][posiY]=9;
				if(posiX>7) {
					break;
				} else {
					posiX++;
				}
			}
		}
		
		for (int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				pen.write(inputArr[i][j]+" ");
			}
			pen.write("\n");
		}
		pen.flush();
	}
}
