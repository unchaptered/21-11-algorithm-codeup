package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1095 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));

		scan.read();
		scan.readLine();
		
		String inputText[]=scan.readLine().split(" ");
		final int length=inputText.length;
		
		int inputNum[]=new int[length];
		for (int i=0; i<length; i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		int tmp=99;
		int count=0;
		while (true) {
			if (tmp>inputNum[count])
				tmp=inputNum[count];
			
			count++;
			
			if (count==length-1)
				break;
		}
		System.out.println(tmp);
	}
}