package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1025 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		char inputText[]=scan.readLine().toCharArray();
		
		final int size=inputText.length;
		int count=size;
		int inputArr[]=new int[size];
		for (int i=0; i<size; i++) {
			inputArr[i]=Integer.parseInt(""+inputText[i])*(int)Math.pow(10, --count);
			System.out.printf("[%d]%n",inputArr[i]);
		}
	}
}