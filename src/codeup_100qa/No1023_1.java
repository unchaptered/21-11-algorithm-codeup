package codeup_100qa;

import java.util.Scanner;

public class No1023_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String inputText[]=scan.next().split("\\.");
		scan.close();
		
		System.out.println(inputText[0]);
		System.out.println(inputText[1]);
	}
}
