package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1029_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText=(scan.readLine());
		double inputDouble=Double.parseDouble(inputText);
		System.out.printf("%.11f",inputDouble);
	}
}