package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1085 {
	public static void main(String[] args) throws IOException { 
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		long h=Long.parseLong(inputText[0]);
		long b=Long.parseLong(inputText[1]);
		long c=Long.parseLong(inputText[2]);
		long s=Long.parseLong(inputText[3]);
		
		double result=(((h*b*c*s)/8)/Math.pow(2, 10)/Math.pow(2, 10));
		System.out.format("%.1f MB",result);
	}
}
