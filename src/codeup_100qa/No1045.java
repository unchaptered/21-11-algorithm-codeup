package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1045 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		int inputNum[]=new int[inputText.length];
		for (int i=0; i<inputText.length; i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		System.out.println((long)inputNum[0]+(long)inputNum[1]+(long)inputNum[2]);
		System.out.printf("%.1f",((float)inputNum[0]+(float)inputNum[1]+(float)inputNum[2])/3);		
	}
}