package acmicpc_basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No11021 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer spliter;
		
		int length=Integer.parseInt(scan.readLine());
		int numA,numB=0;
		for(int i=0; i<length; i++) {
			spliter=new StringTokenizer(scan.readLine()," ");
			numA=Integer.parseInt(spliter.nextToken());
			numB=Integer.parseInt(spliter.nextToken());
			pen.write("Case #"+(i+1)+": "+numA+" + "+numB+" = "+(numA+numB)+"\n");
		}
		pen.flush();
	}
}