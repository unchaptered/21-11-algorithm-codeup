package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 입력 예시 
// x b k d l q g a c
public class No1079_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));

		String inputText[]=scan.readLine().split(" ");
		
		for(int i=0; i<inputText.length; i++) {
			System.out.println(inputText[i]);
			if(inputText[i].charAt(0)=='q') {
				break;
			}
		}
	}
}