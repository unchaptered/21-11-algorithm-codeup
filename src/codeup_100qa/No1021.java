package codeup_100qa;
import java.util.Scanner;

public class No1021 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String inputText=scan.next();
		scan.close();
		
		final int MAX_LENGTH=49;
		final int USER_LENGTH=inputText.length();
		
		int arrayLength;
		if(USER_LENGTH > MAX_LENGTH) {
			arrayLength=MAX_LENGTH;
		} else {
			arrayLength=USER_LENGTH;
		}
		
		System.out.printf("%s", inputText.substring(0,arrayLength));
	}
}
