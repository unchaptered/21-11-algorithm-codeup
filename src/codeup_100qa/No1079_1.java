package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ʋ�� ���!!
// �� "q"!="q" �ϱ�?

// �Է� ���� 
// x b k d l q g a c
public class No1079_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));

		String inputText[]=scan.readLine().split(" ");
		
		for(int i=0; i<inputText.length; i++) {
			if(inputText[i]=="q") {
				System.out.println("q �Դϴ�.");
			} else {
				System.out.println("q �� �ƴմϴ�.");				
			}
		}
	}
}