package codeup_100qa;
import java.util.Scanner;

public class No1011_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String inputText=scan.next();
		scan.close();
		String cutText=inputText.substring(0,1);
		System.out.println(cutText);
	}
}