package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1094 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		
		final int length=Integer.parseInt(scan.readLine());
		
		int inputNum[]=new int[length];
		
		String inputText[]=scan.readLine().split(" ");
		
		for (int i=0; i<length; i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		for (int i=0; i<length; i++) {
			for (int j=i+1; j<length; j++) {
				if(inputNum[i]>inputNum[j]) {
					int tmp=inputNum[i];
					inputNum[i]=inputNum[j];
					inputNum[j]=tmp;
				}
			}
		}

		System.out.println(inputNum[0]);
	}
}
