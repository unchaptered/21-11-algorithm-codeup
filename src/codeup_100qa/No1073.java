package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1073 {
	public static void main(String[] args) throws Exception {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		for(String element : inputText) {
			if(Integer.parseInt(element)==0) {
				break;
			}
			System.out.println(element);
		}
	}
}