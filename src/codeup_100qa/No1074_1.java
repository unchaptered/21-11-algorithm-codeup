package codeup_100qa;

import java.util.Scanner;

public class No1074_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		scan.close();
		
		for (int i=number; i>0; i--)
			System.out.println(i);
	}
}