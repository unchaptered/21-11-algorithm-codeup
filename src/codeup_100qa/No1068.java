package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1068 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText=scan.readLine();
		int inputNumber=Integer.parseInt(inputText);
		
		if (inputNumber >= 90) {
			System.out.print('A');
		} else if (inputNumber >= 70) {
			System.out.print('B');
		} else if (inputNumber >= 40) {
			System.out.print('C');
		} else {
			System.out.print('D');
		}
	}
}
