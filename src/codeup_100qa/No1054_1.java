package codeup_100qa;

import java.util.Scanner;

public class No1054_1 {
	public static void main(String[] args)  {
		Scanner scan=new Scanner(System.in);
		boolean a=scan.nextInt()==1 ? true : false;
		boolean b=scan.nextInt()==1 ? true : false;
		scan.close();
		System.out.println(a&&b==true ? "1" : "0");
	}
}