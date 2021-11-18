package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 71초 훨신 빠르다.
public class No1092_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		int inputNum[]=new int[inputText.length];
		
		for(short i=0; i<inputText.length; i++) {
			inputNum[i]=Integer.parseInt(inputText[i]);
		}
		
		int day=1;
		while(true) {
			if((day%inputNum[0]!=0) || (day%inputNum[1]!=0) || (day%inputNum[2]!=0)) {
				System.out.println(day);
				day++;
				continue;
			} else {
				System.out.println(day);
				break;	
			}
		}
		
	}
}
