package codeup_100qa;

import java.util.Scanner;

public class No1071 {
	public static void main(String[] args)  {
		Scanner scan=new Scanner(System.in);
		while(true) {
			int a=scan.nextInt();
			if(a==0) {
				break;
			}
			System.out.println(a);
		}
		scan.close();
	}
}