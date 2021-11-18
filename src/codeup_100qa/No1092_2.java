package codeup_100qa;

import java.util.Scanner;

// 114 √  »Œæ¿¥¿∏Æ¥Ÿ.
public class No1092_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		scan.close();
		
		int day=2;
		while(true) {
			if((day%num1!=0)||(day%num2!=0)||(day%num3!=0)) {
				day++;
				continue;
			} else {
				System.out.println(day);
				break;
			}
		}
		
	}
}
