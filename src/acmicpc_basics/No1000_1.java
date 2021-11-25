package acmicpc_basics;

import java.util.Scanner;

public class No1000_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		scan.close();
		int num3=num1+num2;
		
		System.out.println(num3);
	}
}
