package acmicpc_basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No1000_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputText[]=scan.readLine().split(" ");
		int length=inputText.length;
		int numArr[]=new int[length];
		int numSum=0;
		for(int i=0; i<length;i++) {
			numArr[i]=Integer.parseInt(inputText[i]);
			numSum+=numArr[i];
		}
		
		pen.write(numSum+"");
		pen.flush();
	}
}
