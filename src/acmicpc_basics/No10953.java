package acmicpc_basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No10953 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer spliter;
		String inputText;
		int count=0;
		int a=0;
		int b=0;
		count=Integer.parseInt(scan.readLine());
		while(count!=0) {
			inputText=scan.readLine();
			spliter=new StringTokenizer(inputText,",");
			a=Integer.parseInt(spliter.nextToken());
			b=Integer.parseInt(spliter.nextToken());
			pen.write(a+b+"\n");
			count--;
		}
		pen.flush();
	}
}