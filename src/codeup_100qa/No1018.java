package codeup_100qa;
import java.util.Scanner;

public class No1018 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String inputText=scan.next();
		scan.close();
		String inputArr[]=inputText.split(":");
		System.out.printf("%s:%s",inputArr[0],inputArr[1]);
	}
}
