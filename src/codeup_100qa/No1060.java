package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1060 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		int inputNum[]=new int[inputText.length];
		for(int i=0;i<inputText.length;i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		System.out.println(inputNum[0]&inputNum[1]);
	}
}