package codeup_100qa;
import java.util.Scanner;

public class No1014 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		scan.close();
		char aChar=a.charAt(0);
		char bChar=b.charAt(0);
		System.out.printf("%c %c", bChar, aChar);
	}
}
