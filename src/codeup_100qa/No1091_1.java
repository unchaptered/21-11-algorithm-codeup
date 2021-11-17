package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 입력값 1 -2 1 8 출력값 -85
public class No1091_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		short inputNum[]=new short[inputText.length];
		for(short i=0; i<inputText.length; i++)
			inputNum[i]=(short) Integer.parseInt(inputText[i]);
		
		long calc=inputNum[0];
		for (int i=0; i<inputNum[3]-1; i++)
			calc=calc*inputNum[1]+inputNum[2];
		
		System.out.printf("%d", calc);
	}
}