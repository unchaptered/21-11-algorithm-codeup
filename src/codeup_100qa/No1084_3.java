package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class No1084_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		

		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		int count=0;
		for (int i=0; i<Integer.parseInt(inputText[0]); i++) {
			for (int j=0; j<Integer.parseInt(inputText[1]); j++) {
				for (int k=0; k<Integer.parseInt(inputText[2]); k++) {
					pen.write(i + " " + j + " " + k + "\n");
					count++;
				}
			}
		}
		
		pen.write(String.valueOf(count));
		pen.flush();
	}
}