package acmicpc_basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No10950 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num=Integer.parseInt(scan.readLine());
		for(int i=0; i<num; i++) {
			String inputText[]=scan.readLine().split(" ");
			int numSum=0;
			for(int j=0; j<inputText.length; j++) {
				numSum+=Integer.parseInt(inputText[j]);
			}
			pen.write(numSum+"\n");
		}
		pen.flush();
	}
}
