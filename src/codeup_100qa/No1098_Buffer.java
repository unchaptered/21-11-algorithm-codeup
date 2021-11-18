package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1098_Buffer  {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		
		// 배열 생성
		String inputText[]=scan.readLine().split(" ");
		int sizeX=Integer.parseInt(inputText[0]);
		int sizeY=Integer.parseInt(inputText[1]);
		int numArr[][]=new int[sizeX][sizeY];
		
		// 반복구문 실행
		int count=Integer.parseInt(scan.readLine());
		for (int c=0; c<count; c++) {
			String inputLine[]=scan.readLine().split(" ");
			
			int length=Integer.parseInt(inputLine[0]);
			int arrow=Integer.parseInt(inputLine[1]);
			int posiX=Integer.parseInt(inputLine[2])-1;
			int posiY=Integer.parseInt(inputLine[3])-1;
			if (arrow==0) { // 가로축
				for(int i=0; i<length; i++)
					numArr[posiX][posiY+i]++;
			} else { // 세로축
				for(int i=0; i<length; i++)
					numArr[posiX+i][posiY]++;
			}
		}
		
		// 출력
		for (int i=0; i<sizeX; i++) {
			for (int j=0; j<sizeY; j++) {
				System.out.print(numArr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
