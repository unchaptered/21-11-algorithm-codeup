package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class No1023_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split("\\.");
		
		BufferedWriter pen = new BufferedWriter(new OutputStreamWriter(System.out));
		pen.write(inputText[0]+"\n");
		pen.write(inputText[1]);
		pen.flush();
	}
}