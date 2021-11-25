package acmicpc_basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No2558 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int numA=Integer.parseInt(scan.readLine());
		int numB=Integer.parseInt(scan.readLine());
		int numSum=numA+numB;
		
		pen.write(""+numSum);
		pen.flush();
	}
}
