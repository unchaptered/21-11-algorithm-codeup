package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1072_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String LENGTH=scan.readLine();
		String inputArr[]=scan.readLine().split(" ");
		for(String element : inputArr) {
			System.out.println(element);
		}
	}
}