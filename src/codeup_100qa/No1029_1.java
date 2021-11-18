package codeup_100qa;

import java.util.Scanner;

public class No1029_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String inputText=scan.next();
		scan.close();
		double inputDouble=Double.parseDouble(inputText);
		System.out.printf("%.11f",inputDouble);
	}
}
