package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1067_2 {
	public static void main(String[] args) throws IOException { 
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText=scan.readLine();
		int inputNumber=Integer.parseInt(inputText);
		
		if (inputNumber > 0) {
			System.out.println("plus");
		} else {
			System.out.println("minus");
		}
		
		if (inputNumber%2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}