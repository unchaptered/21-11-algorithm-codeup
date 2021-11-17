package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int numLetter=(int)scan.readLine().charAt(0);
		
		for(int i=97; i<=numLetter; i++)
			System.out.println((char)i);
	}
}
