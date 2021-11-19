package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1099_2_FAIL {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		
		int size=10;
		int mazeGround[][]=new int[10][10];
		for (int i=0; i<size; i++) {
			String inputLine[]=scan.readLine().split(" ");
			for (int j=0; j<size; j++) { 
				mazeGround[i][j]=Integer.parseInt(inputLine[j]);
			}
		}
		
		int posiX=1;
		int posiY=1;
		mazeGround[1][1]=9;
		while(true) {
			int target=mazeGround[posiX][posiY+1];
			
			if(target==1 || target==2) {
				posiX=(!(posiX>9)) ? posiX+1 : posiX;
				if(mazeGround[posiX][posiY]==2) {
					mazeGround[posiX][posiY]=9;
					break;
				}else{
					mazeGround[posiX][posiY]=9;
				}
			} else {
				posiY=(!(posiY>9)) ? posiY+1 : posiY;
				if(mazeGround[posiX][posiY]==2) {
					mazeGround[posiX][posiY]=9;
					break;
				} else {
					mazeGround[posiX][posiY]=9;
				}
			}

		};
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				System.out.print(mazeGround[i][j]+" ");
			}
			System.out.println();
		}
	}
}