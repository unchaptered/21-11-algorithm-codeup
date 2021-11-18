package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1042 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		int numA=Integer.parseInt(inputText[0]);
		int numB=Integer.parseInt(inputText[1]);
		
		System.out.println(numA/numB);
	}
}