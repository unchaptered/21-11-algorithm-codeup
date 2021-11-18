package codeup_100qa;

import java.util.Scanner;

public class No1084_1_FAIL {
	public static void main(String[] args)  {
		Scanner scan=new Scanner(System.in);
		
		short a=scan.nextShort();
		short b=scan.nextShort();
		short c=scan.nextShort();
		scan.close();
		
		short count=0;
		for(short i=0; i<a; i++) {
			for(short j=0; j<b; j++) {
				for(short k=0; k<c; k++) {
					count++;
					System.out.printf("%d %d %d%n", i, j, k);
				}
			}
		}
		System.out.println(count);
	}
}