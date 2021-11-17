package codeup_100qa;

import java.util.Scanner;

public class No1091_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();
		int multiple=scan.nextInt();
		int plus=scan.nextInt();
		int count=scan.nextInt();
		scan.close();
		
		long result=start;
		for(int i=1;i<count;i++)
			result=result*multiple+plus;
		
		System.out.println(result);
	}
}