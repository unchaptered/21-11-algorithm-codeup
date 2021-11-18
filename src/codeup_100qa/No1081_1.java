package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 134√ 
public class No1081_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		short inputNum[]=new short[inputText.length];
		for(short i=0; i<inputNum.length; i++)
			inputNum[i]=Short.parseShort(inputText[i]);
			
		for(short i=1; i<=inputNum[0]; i++)
			for(short j=1; j<=inputNum[1]; j++)
				System.out.printf("%d %d%n",i,j);
	}
}
