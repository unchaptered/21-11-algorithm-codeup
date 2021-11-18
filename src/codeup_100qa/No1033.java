package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1033 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText=Integer.toHexString(Integer.parseInt(scan.readLine())).toUpperCase();
		System.out.println(inputText);
	}
}