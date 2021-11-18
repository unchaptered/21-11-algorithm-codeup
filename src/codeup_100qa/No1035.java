package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1035 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText=Integer.toOctalString(Integer.valueOf(scan.readLine(),16));
		System.out.println(inputText);
	}
}