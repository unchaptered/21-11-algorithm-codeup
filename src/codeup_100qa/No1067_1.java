package codeup_100qa;

import java.util.Scanner;

public class No1067_1 {
	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		String inputText=scan.next();
		scan.close();
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