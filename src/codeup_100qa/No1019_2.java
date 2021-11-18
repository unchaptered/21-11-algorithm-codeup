package codeup_100qa;
import java.util.Scanner;

public class No1019_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String inputText=scan.next();
		
		scan.close();
		String inputArr[]=inputText.split("\\.");
		
		int newArr[]=new int[3];
		for(int i=0; i<inputArr.length; i++) {
			newArr[i]=Integer.parseInt(inputArr[i]);
		}
		System.out.printf("%04d.%02d.%02d",newArr[0],newArr[1],newArr[2]);
	}
}