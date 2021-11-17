package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1072_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String LENGTH=scan.readLine();
		String inputArr[]=scan.readLine().split(" ");
		for(int i=0; i<inputArr.length; i++) {
			System.out.println(inputArr[i]);
		}
		
	}
}