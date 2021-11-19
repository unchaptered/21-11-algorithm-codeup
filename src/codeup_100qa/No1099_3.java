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

		// 10 x 10 �迭 ���� > �� �پ� BufferedReader �� �ް� �Ű� ���
		final int size=10;
		int inputArr[][]=new int[size][size];
		for (int i=0; i<size; i++) {
			String inputLine[]=scan.readLine().split(" ");
			for (int j=0; j<inputLine.length; j++) {
				inputArr[i][j]=Integer.parseInt(inputLine[j]);
			}
		}
		
		// ������ ���� ������ inputArr[1][1] �� �ִ�...
		// ������ �������� inputArr[1][1] �̰� ������ inputArr[x][y] ���� ���µ�...
		// �� ������ 2�� ������ �����.
		int posiX=1;
		int posiY=1;
		while (true) {
			if(inputArr[posiX][posiY]==2) {
				// ���̶�� ����
				inputArr[posiX][posiY]=9;
				break;
			} else if (inputArr[posiX][posiY+1]!=1) {
				// ���� �ƴϸ� ������ �̵�
				inputArr[posiX][posiY]=9;
				if(posiY>7) {
					break;
				} else {
					posiY++;
				}
			} else {
				// ���̸� �Ʒ��� �̵�
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
