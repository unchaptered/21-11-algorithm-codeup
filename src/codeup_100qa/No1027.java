package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1027 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split("\\.");
		System.out.printf("%02d-%02d-%04d",Integer.parseInt(inputText[2]),Integer.parseInt(inputText[1]),Integer.parseInt(inputText[0]));
	}
}
