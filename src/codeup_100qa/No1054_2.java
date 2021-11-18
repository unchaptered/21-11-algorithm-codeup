package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1054_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		final int length=inputText.length;
		boolean inputBool[]=new boolean[length];
		for(int i=0; i<length; i++)
			inputBool[i]=Integer.parseInt(inputText[i])==1 ? true : false;
		
		System.out.println(inputBool[0]||inputBool[1]==true ? 1 : 0);
	}
}