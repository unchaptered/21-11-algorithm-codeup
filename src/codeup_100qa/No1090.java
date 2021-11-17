package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No1090 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		int inputNum[]=new int[inputText.length];
		
		for(int i=0; i<inputText.length; i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		float calc=inputNum[0];
		for(int i=0; i<inputNum[2]-1; i++)
			calc=calc*inputNum[1];
		
		System.out.printf("%.0f",calc);
	}
}
